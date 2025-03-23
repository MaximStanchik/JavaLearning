package org.Stanchik.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.Stanchik.entity.Cat;
import org.Stanchik.repository.CatRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j // добавление логирования. Такая штука есть в ломбок
@RestController
@RequiredArgsConstructor
public class MainController {

    private final CatRepo catRepo;
    private final ObjectMapper objectMapper;

    @PostMapping("/api/add")
    public String addCat(@RequestBody Cat cat) {
        log.info("New row: " + catRepo.save(cat));
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

}
