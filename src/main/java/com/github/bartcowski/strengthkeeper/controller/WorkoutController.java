package com.github.bartcowski.strengthkeeper.controller;

import com.github.bartcowski.strengthkeeper.controller.dto.WorkoutDto;
import com.github.bartcowski.strengthkeeper.model.mapper.WorkoutDtoMapper;
import com.github.bartcowski.strengthkeeper.model.service.WorkoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WorkoutController {

    private final WorkoutService workoutService;
    private final WorkoutDtoMapper workoutDtoMapper;

    @GetMapping("/workouts")
    public List<WorkoutDto> getAllWorkouts(@RequestParam(required = false) int page) {
        if (page < 0) {
            page = 0;
        }
        return workoutDtoMapper.mapToWorkoutDtos(workoutService.getAllWorkouts(page));
    }

    @GetMapping("/users/{userName}/workouts")
    public List<WorkoutDto> getAllUserWorkouts(@PathVariable String userName) {
        return workoutDtoMapper.mapToWorkoutDtos(workoutService.getAllUserWorkouts(userName));
    }
}
