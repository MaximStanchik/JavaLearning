package org.Stanchik.Controllers;

import lombok.RequiredArgsConstructor;
import org.Stanchik.DTO.UserCreateDto;
import org.Stanchik.DTO.UserResponse;
import org.Stanchik.Entities.User;
import org.Stanchik.Mappers.UserMapper;
import org.Stanchik.Repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public ResponseEntity<List<UserResponse>> findAll() {
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponseList = userMapper.toUserResponseList(users);
        return ResponseEntity.ok(userResponseList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.isPresent() ? ResponseEntity.ok(userMapper.toUserResponse(user.get())) :
                ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserCreateDto userCreateDto) {
        User user = userMapper.fromUserCreateDto(userCreateDto);
        User savedUser = userRepository.save(user);
        UserResponse userResponse = userMapper.toUserResponse(savedUser);
        return ResponseEntity.ok(userResponse);
    }

}
