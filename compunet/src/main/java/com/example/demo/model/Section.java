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
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String flag;

    @Column(name = "order_col")
    private Integer orderCol;

    private String type;

    @Column(name = "background_image")
    private String backgroundImage;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section parentSection;

    @JsonIgnore
    @OneToMany(mappedBy = "parentSection")
    private List<Section> childSections;

    @JsonIgnore
    @OneToMany(mappedBy = "section")
    private List<Question> questions;
}