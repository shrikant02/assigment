package com.shrikant.repository;

import com.shrikant.entity.AnswerLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerLikeRepository extends JpaRepository<AnswerLike,Integer> {

    AnswerLike findById(int id);
}
