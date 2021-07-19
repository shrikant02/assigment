package com.shrikant.controller;

import com.shrikant.entity.Answer;
import com.shrikant.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answer")
@AllArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @PostMapping("/post")
    public int postAnswer(@RequestBody Answer answer){
        return answerService.saveAnswer(answer);
    }

    @GetMapping("/get/{id}")
    public Answer answer(@PathVariable("id") int id){
        Answer answer = answerService.getAnswer(id);
        answer.getUser().toString();
        return answer;
    }
}
