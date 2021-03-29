package com.github.bartcowski.strengthkeeper.controller.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class WorkoutDto {
    private final int id;
    private final String userName;
    private final LocalDate date;
    private final boolean deload;
    private final String comment;
}
