package com.pomodoro.method_pomodoro_api.entities;

import java.time.LocalDateTime;

public class TransformPomodoroToLocalDate {

    private LocalDateTime timeInitOfStudy;

    private LocalDateTime timeFinalOfStudy;

    private LocalDateTime timeInitOfInterval;

    private LocalDateTime timeFinalOfInterval;

    public TransformPomodoroToLocalDate(LocalDateTime timeInitOfStudy, LocalDateTime timeFinalOfStudy, LocalDateTime timeInitOfInterval, LocalDateTime timeFinalOfInterval) {
        this.timeInitOfStudy = timeInitOfStudy;
        this.timeFinalOfStudy = timeFinalOfStudy;
        this.timeInitOfInterval = timeInitOfInterval;
        this.timeFinalOfInterval = timeFinalOfInterval;
    }

    public LocalDateTime getTimeInitOfStudy() {
        return timeInitOfStudy;
    }

    public void setTimeInitOfStudy(LocalDateTime timeInitOfStudy) {
        this.timeInitOfStudy = timeInitOfStudy;
    }

    public LocalDateTime getTimeFinalOfStudy() {
        return timeFinalOfStudy;
    }

    public void setTimeFinalOfStudy(LocalDateTime timeFinalOfStudy) {
        this.timeFinalOfStudy = timeFinalOfStudy;
    }

    public LocalDateTime getTimeInitOfInterval() {
        return timeInitOfInterval;
    }

    public void setTimeInitOfInterval(LocalDateTime timeInitOfInterval) {
        this.timeInitOfInterval = timeInitOfInterval;
    }

    public LocalDateTime getTimeFinalOfInterval() {
        return timeFinalOfInterval;
    }

    public void setTimeFinalOfInterval(LocalDateTime timeFinalOfInterval) {
        this.timeFinalOfInterval = timeFinalOfInterval;
    }
}
