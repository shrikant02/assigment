package com.shrikant.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "question_like")
@Getter
@Setter
public class QuestionLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference(value = "question-like")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question")
    private Question question;

    @JsonBackReference(value = "user-like")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;
}
