package com.shrikant.service;

import com.shrikant.dto.CommentDto;
import com.shrikant.entity.Comment;
import com.shrikant.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentDto commentDto;
    private final CommentRepository commentRepository;

    public int postComment(Comment comment){
        return commentRepository.save(comment).getId();
    }

    public CommentDto getCommentById(int id){
        Comment comment = commentRepository.findById(id);
        CommentDto commentDto = new CommentDto(
                comment.getId(),comment.getAnswer().getId(),comment.getUser().getId(),comment.getText());
        return commentDto;
    }
}
