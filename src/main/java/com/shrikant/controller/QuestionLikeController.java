package com.shrikant.controller;

import com.shrikant.dto.QuestionLikeDto;
import com.shrikant.entity.QuestionLike;
import com.shrikant.service.QuestionLikeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "question-like")
@AllArgsConstructor
public class QuestionLikeController {

    private final QuestionLikeService questionLikeService;

    @PostMapping("/post")
    public int postQuestionLike(@RequestBody QuestionLike questionLike){
        return questionLikeService.postQuestionLike(questionLike);
    }

    @GetMapping("/get/{id}")
    public QuestionLikeDto getQuestionLike(@PathVariable("id") int id){
        QuestionLike questionLike =  questionLikeService.getQuestionLikeById(id);
        return new QuestionLikeDto(questionLike.getId(),
                questionLike.getQuestion().getId()
                ,questionLike.getUser().getId());
    }
}
