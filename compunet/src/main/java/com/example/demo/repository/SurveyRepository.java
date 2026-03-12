package com.example.demo.repository;

import com.example.demo.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Integer> {

    List<Survey> findByNameContainingIgnoreCase(String name);
}