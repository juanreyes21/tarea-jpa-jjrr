package com.example.demo.service;

import com.example.demo.model.Option;
import com.example.demo.repository.OptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    private final OptionRepository optionRepository;

    public OptionService(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    public List<Option> getOptionsByGroup(Integer groupId) {
        return optionRepository.findByGroupId(groupId);
    }

    public List<Option> getOptionsByQuestion(Integer questionId) {
        return optionRepository.findByOptionQuestionsQuestionId(questionId);
    }
}