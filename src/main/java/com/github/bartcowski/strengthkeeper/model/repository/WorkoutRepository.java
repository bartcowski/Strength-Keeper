package com.github.bartcowski.strengthkeeper.model.repository;

import com.github.bartcowski.strengthkeeper.model.domain.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer> {
    List<Workout> findAllByUserName(String userName);
}
