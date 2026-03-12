package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "order_col")
    private Integer orderCol;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question parentQuestion;

    @OneToMany(mappedBy = "parentQuestion")
    private List<Question> childQuestions;

    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "name")
    private Type type;


    @JsonIgnore
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @JsonIgnore
    @OneToMany(mappedBy = "question")
    private List<OptionQuestion> optionQuestions;
}