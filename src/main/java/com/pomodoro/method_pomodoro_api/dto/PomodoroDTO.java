package com.pomodoro.method_pomodoro_api.dto;

import com.pomodoro.method_pomodoro_api.entities.Pomodoro;
import com.pomodoro.method_pomodoro_api.entities.User;

public class PomodoroDTO {

    private User user;

    private Long id;

    private int minutesOfStudy;

    private int minutesOfInterval;

    public PomodoroDTO(User user, int minutesOfStudy, int minutesOfInterval) {
        this.user = user;
        this.minutesOfStudy = minutesOfStudy;
        this.minutesOfInterval = minutesOfInterval;
    }

    public PomodoroDTO(){
    }

    public PomodoroDTO(Pomodoro pomodoro){
        this.user = pomodoro.getUser();

        this.minutesOfInterval = pomodoro.getMinutesOfInterval();

        this.minutesOfStudy = pomodoro.getMinutesOfStudy();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getMinutesOfStudy() {
        return minutesOfStudy;
    }

    public void setMinutesOfStudy(int minutesOfStudy) {
        this.minutesOfStudy = minutesOfStudy;
    }

    public int getMinutesOfInterval() {
        return minutesOfInterval;
    }

    public void setMinutesOfInterval(int minutesOfInterval) {
        this.minutesOfInterval = minutesOfInterval;
    }
}
