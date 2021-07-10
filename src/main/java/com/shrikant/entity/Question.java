package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    @JsonBackReference(value = "company-question")
    @JoinColumn(name = "company")
    @ManyToOne
    private Company company;

    @JsonBackReference(value = "user-question")
    @JoinColumn(name = "user")
    @ManyToOne
    private User user;

    @JsonManagedReference(value = "answer-question")
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
