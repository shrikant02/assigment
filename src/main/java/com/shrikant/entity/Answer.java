package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    @JsonBackReference(value = "answer-question")
    @JoinColumn(name = "question")
    @ManyToOne
    private Question question;

    @JsonBackReference(value = "user-answer")
    @JoinColumn(name = "user")
    @ManyToOne()
    private User user;
}
