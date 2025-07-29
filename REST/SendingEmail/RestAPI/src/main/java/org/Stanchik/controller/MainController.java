package org.Stanchik.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.Stanchik.DTO.CatDTO;
import org.Stanchik.entity.Cat;
import org.Stanchik.repository.CatRepo;
import org.Stanchik.service.MailSenderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "main_methods")
@Slf4j // добавление логирования. Такая штука есть в ломбок
@RestController
@RequiredArgsConstructor
public class MainController {

    private final CatRepo catRepo;
    private final MailSenderService mailSender;

    @PostMapping("/api/add")
    public String addCat(@RequestBody CatDTO catDto) {
        log.info("New row: " + catRepo.save(Cat.builder()
                        .age(catDto.getAge())
                        .name(catDto.getName())
                        .weight(catDto.getWeight())
                .build()));
        return "Все добавилось успешно";
    }

    @GetMapping("/api/all")
    public List<Cat> getAll() {
        return catRepo.findAll();
    }

    @GetMapping("/api/getcat")
    public String getCat(@RequestParam int id) {
        Cat cat = catRepo.findById(id).orElseThrow(() -> new RuntimeException("Cat not found"));
        return cat.toString();
    }

    @DeleteMapping("/api/delete/{id}")
    public ResponseEntity<String> deleteCat(@PathVariable int id) {
        if (catRepo.existsById(id)) {
            catRepo.deleteById(id);
            return ResponseEntity.ok("Кот с ID " + id + " успешно удален.");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Кот с ID " + id + " не существует.");
        }

    }

    @PutMapping("/api/put")
    public String changeCat (@RequestBody Cat cat) {
        int id = cat.getId();
        if (!catRepo.existsById(id)) {
            return "No such a row!";
        }
        else {
            return catRepo.save(cat).toString();
        }

    }
    @GetMapping("/hello")
    public void sayHelloFromCat(@RequestParam int id) {
        var cat = catRepo.findById(id).orElseThrow();
        mailSender.send(
                "maximstanchik@gmail.com",
                "Hello From Kitten!",
                "Hello, my name is " + cat.getName() + ". Have a nice day!"
        );
    }

}
