package com.example.demo.repository;

import com.example.demo.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Integer> {

    List<Section> findBySurveyIdAndParentSectionIsNull(Integer surveyId);
}