package com.example.demo.repository;

import com.example.demo.model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

    List<Interview> findBySurveyIdOrderByTimeStartAsc(Integer surveyId);

    Optional<Interview> findFirstBySurveyIdOrderByTimeStartAsc(Integer surveyId);

    boolean existsByInterviewerId(Integer interviewerId);

    long countBySurveyId(Integer surveyId);
}