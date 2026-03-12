package com.example.demo.repository;

import com.example.demo.model.OptionQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionQuestionRepository extends JpaRepository<OptionQuestion, Integer> {

    List<OptionQuestion> findByQuestionId(Integer questionId);
}