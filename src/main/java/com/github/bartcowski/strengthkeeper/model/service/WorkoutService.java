package com.github.bartcowski.strengthkeeper.model.service;

import com.github.bartcowski.strengthkeeper.model.domain.Workout;
import com.github.bartcowski.strengthkeeper.model.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkoutService {

    private static final int PAGE_SIZE = 10;
    private final WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts(int page) {
        return workoutRepository.findAll(PageRequest.of(page, PAGE_SIZE)).toList();
    }

    public List<Workout> getAllUserWorkouts(String userName) {
        return workoutRepository.findAllByUserName(userName);
    }
}
