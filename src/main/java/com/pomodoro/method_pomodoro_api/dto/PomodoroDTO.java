package com.pomodoro.method_pomodoro_api.dto;

import com.pomodoro.method_pomodoro_api.entities.Pomodoro;

public class PomodoroDTO {

    private Long id;

    private Integer minutesOfInterval;

    private Integer minutesOfStudy;

    public PomodoroDTO(Long id, Integer minutesOfInterval, Integer minutesOfStudy) {
        this.id = id;
        this.minutesOfInterval = minutesOfInterval;
        this.minutesOfStudy = minutesOfStudy;
    }

    public PomodoroDTO (Pomodoro pomodoro){
        this.id = pomodoro.getId();

        this.minutesOfStudy = pomodoro.getMinutesOfStudy();

        this.minutesOfInterval = pomodoro.getMinutesOfInterval();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMinutesOfInterval() {
        return minutesOfInterval;
    }

    public void setMinutesOfInterval(Integer minutesOfInterval) {
        this.minutesOfInterval = minutesOfInterval;
    }

    public Integer getMinutesOfStudy() {
        return minutesOfStudy;
    }

    public void setMinutesOfStudy(Integer minutesOfStudy) {
        this.minutesOfStudy = minutesOfStudy;
    }
}
