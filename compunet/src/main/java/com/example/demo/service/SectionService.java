package com.example.demo.service;

import com.example.demo.model.Section;
import com.example.demo.repository.SectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {

    private final SectionRepository sectionRepository;

    public SectionService(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    public List<Section> getRootSectionsBySurvey(Integer surveyId) {
        return sectionRepository.findBySurveyIdAndParentSectionIsNull(surveyId);
    }
}