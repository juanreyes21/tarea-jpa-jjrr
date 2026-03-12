package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "interview")
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time_start")
    private LocalDateTime timeStart;

    @Column(name = "time_end")
    private LocalDateTime timeEnd;

    private String username;

    @Column(name = "interviewer_id")
    private Integer interviewerId;

    @Column(name = "institution_id")
    private Integer institutionId;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;


    @JsonIgnore
    @OneToMany(mappedBy = "interview")
    private List<Answer> answers;
}