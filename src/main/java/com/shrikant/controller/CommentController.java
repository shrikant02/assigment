package com.shrikant.controller;

import com.shrikant.dto.CommentDto;
import com.shrikant.entity.Comment;
import com.shrikant.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/comment")
@AllArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/post")
    public int postComment(@RequestBody Comment comment){
        return commentService.postComment(comment);
    }

    @GetMapping("/get/{id}")
    public CommentDto getComment(@PathVariable("id") int id){
        return commentService.getCommentById(id);
    }

}
