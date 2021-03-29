package com.github.bartcowski.strengthkeeper.model.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Exercise {
    @Id
    private int id;
    private String name;
    private int sets;
    private int reps;
    private int weight;
    private String comment;
}
