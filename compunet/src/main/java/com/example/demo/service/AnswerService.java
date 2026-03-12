package com.example.demo.service;

import com.example.demo.model.Answer;
import com.example.demo.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public List<Answer> getAnswersByInterview(Integer interviewId) {
        return answerRepository.findByInterviewId(interviewId);
    }

    public List<Answer> getAnswersByQuestion(Integer questionId) {
        return answerRepository.findByQuestionId(questionId);
    }
}