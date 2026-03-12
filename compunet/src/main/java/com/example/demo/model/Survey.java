package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "survey")
public class Survey {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(columnDefinition  = "TEXT")
    private String intro;


    private String validation;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(columnDefinition  = "TEXT")
    private String outro;

    @Column(columnDefinition  = "TEXT")
    private String styles;

    @JsonIgnore
    @OneToMany(mappedBy = "survey")
    private List<Section> sections;

    @JsonIgnore
    @OneToMany(mappedBy = "survey")
    private List<Interview> interviews;
}
