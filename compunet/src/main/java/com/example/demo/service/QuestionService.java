package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionsBySurvey(Integer surveyId) {
        return questionRepository.findBySectionSurveyId(surveyId);
    }

    public List<Question> getQuestionsByType(String typeName) {
        return questionRepository.findByTypeNameIgnoreCase(typeName);
    }
}