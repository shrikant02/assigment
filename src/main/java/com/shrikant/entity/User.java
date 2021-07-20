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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JsonManagedReference(value = "user-question")
    @OneToMany(mappedBy = "user")
    private List<Question> questions;

    @JsonBackReference(value = "user-answer")
    @OneToMany(mappedBy = "user")
    private List<Answer> answers;

    @JsonManagedReference(value = "user-comment")
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @JsonManagedReference(value = "user-questionLike")
    @OneToMany(mappedBy = "user")
    private List<QuestionLike> questionLikes;

    @JsonManagedReference(value = "user-answerLike")
    @OneToMany(mappedBy = "user")
    private List<AnswerLike> answerLikes;
}
