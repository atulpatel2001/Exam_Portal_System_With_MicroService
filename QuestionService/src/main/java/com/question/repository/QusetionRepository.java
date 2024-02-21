package com.question.repository;

import com.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QusetionRepository extends JpaRepository<Question,Long> {


    List<Question> findByQuizId(Long id);
}
