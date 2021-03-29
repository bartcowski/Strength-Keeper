package com.github.bartcowski.strengthkeeper.model.mapper;

import com.github.bartcowski.strengthkeeper.controller.dto.WorkoutDto;
import com.github.bartcowski.strengthkeeper.model.domain.Workout;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WorkoutDtoMapper {
    public List<WorkoutDto> mapToWorkoutDtos(List<Workout> allWorkouts) {
        return allWorkouts.stream()
                .map(workout -> mapToWorkoutDto(workout))
                .collect(Collectors.toList());
    }

    private WorkoutDto mapToWorkoutDto(Workout workout) {
        return WorkoutDto.builder()
                .id(workout.getId())
                .userName(workout.getUserName())
                .date(workout.getDate())
                .deload(workout.isDeload())
                .comment(workout.getComment())
                .build();
    }
}
