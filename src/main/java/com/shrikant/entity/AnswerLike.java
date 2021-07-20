package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "answer_like")
@Getter
@Setter
public class AnswerLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference(value = "answer-like")
    @ManyToOne
    @JoinColumn(name = "answer")
    private Answer answer;

    @JsonBackReference(value = "user-answerLike")
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
}
