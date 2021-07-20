package com.shrikant.controller;

import com.shrikant.entity.AnswerLike;
import com.shrikant.service.AnswerLikeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/answer-like")
@AllArgsConstructor
public class AnswerLikeController {

    private final AnswerLikeService answerLikeService;

    @PostMapping("/post")
    public int postAnswerLike(@RequestBody AnswerLike answerLike){
        return answerLikeService.postAnswerLike(answerLike);
    }

    @GetMapping("/get/{id}")
    public AnswerLike getAnswerLike(@PathVariable("id") int id){
        return answerLikeService.getAnswerLike(id);
    }
}
