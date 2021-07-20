package com.shrikant.service;

import com.shrikant.entity.AnswerLike;
import com.shrikant.repository.AnswerLikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnswerLikeService {

    private final AnswerLikeRepository answerLikeRepository;

    public int postAnswerLike(AnswerLike answerLike){
        return answerLikeRepository.save(answerLike).getId();
    }

    public AnswerLike getAnswerLike(int id){
        return answerLikeRepository.findById(id);
    }
}
