package com.github.bartcowski.strengthkeeper.model.repository;

import com.github.bartcowski.strengthkeeper.model.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
