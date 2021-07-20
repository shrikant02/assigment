package com.shrikant.service;

import com.shrikant.entity.Question;
import com.shrikant.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public Question getQuestionById(int id){
        return questionRepository.findById(id);
    }

    public List<Question> getAllQuestion(){
        return questionRepository.findAll();
    }

    public int saveQuestion(Question question){
        return questionRepository.save(question).getId();

             /*if(question.getText().length() < 50 && question.getText().length() > 500){
            throw new IllegalStateException("Invalid length of the question");
        } else {
            Question question1 =  questionRepository.save(question);
            return question1.getId();
        }*/
    }

}
