package com.shrikant.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JsonManagedReference(value = "user-question")
    @OneToMany(mappedBy = "user")
    private List<Question> questions;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Answer> answers;

}
