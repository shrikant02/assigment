package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference(value = "answer-comment")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "answer")
    private Answer answer;

    @JsonBackReference(value = "user-comment")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;

    private String text;
}
