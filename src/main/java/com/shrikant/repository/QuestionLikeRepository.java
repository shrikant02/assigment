package com.shrikant.repository;

import com.shrikant.entity.QuestionLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionLikeRepository extends JpaRepository<QuestionLike,Integer> {

    public QuestionLike findById(int id);

}
