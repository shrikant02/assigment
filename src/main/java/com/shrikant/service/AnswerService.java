package com.shrikant.service;

import com.shrikant.entity.Answer;
import com.shrikant.repository.AnswerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public int saveAnswer(Answer answer){
        return answerRepository.save(answer).getId();
    }
}
