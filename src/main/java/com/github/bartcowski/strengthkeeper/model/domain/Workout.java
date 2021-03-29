package com.github.bartcowski.strengthkeeper.model.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Workout {
    @Id
    private int id;
    private String userName;
    private LocalDate date;
    private boolean deload;
    private String comment;

    @OneToMany
    @JoinColumn(name = "workout_id")
    @BatchSize(size = 10)
    private List<Exercise> exercises;
}
