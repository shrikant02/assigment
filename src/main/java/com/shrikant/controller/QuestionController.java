package com.shrikant.controller;

import com.shrikant.entity.Question;
import com.shrikant.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@AllArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/getall")
    public List<Question> getAll(){
        return questionService.getAllQuestion();
    }

    @PostMapping("/post")
    public int postQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);
    }
}
