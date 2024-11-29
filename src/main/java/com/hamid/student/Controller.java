package com.hamid.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {

    @GetMapping
    public List<String> select() {
        return List.of(
                "Tom",
                "Rose",
                "John"
        );
    }
}
