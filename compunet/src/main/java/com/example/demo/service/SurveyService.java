package com.example.demo.service;

import com.example.demo.model.Survey;
import com.example.demo.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    private final SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public List<Survey> searchByName(String name) {
        return surveyRepository.findByNameContainingIgnoreCase(name);
    }
}