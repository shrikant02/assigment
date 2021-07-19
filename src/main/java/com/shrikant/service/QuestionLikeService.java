package com.shrikant.service;

import com.shrikant.entity.QuestionLike;
import com.shrikant.repository.QuestionLikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionLikeService {

    private final QuestionLikeRepository questionLikeRepository;

    public QuestionLike getQuestionLikeById(int id){
        return questionLikeRepository.findById(id);
    }

    public int postQuestionLike(QuestionLike questionLike) {
        return questionLikeRepository.save(questionLike).getId();
    }
}
