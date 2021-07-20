package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    @JsonBackReference(value = "user-answer")
    @JoinColumn(name = "user")
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private User user;

    @JsonBackReference(value = "answer-question")
    @JoinColumn(name = "question")
    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    @JsonManagedReference(value = "answer-comment")
    @OneToMany(mappedBy = "answer")
    private List<Comment> comments;

    @JsonManagedReference(value = "answer-like")
    @OneToMany(mappedBy = "answer")
    private List<AnswerLike> likes;

}
