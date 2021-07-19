package com.shrikant.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionLikeDto {

    private int id;
    private int answerId;
    private int userId;
}
