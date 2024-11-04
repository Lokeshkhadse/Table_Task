package com.example.Task.Controller;

import com.example.Task.Dto.Dto;
import com.example.Task.Service.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LogicController {

    @Autowired
    private LogicService logicService;

    @GetMapping("/output")
    public ResponseEntity<List<Dto>> getOutput(@RequestParam String name) {
        return new ResponseEntity<>(logicService.getoutput(name), HttpStatus.OK);
    }
}
