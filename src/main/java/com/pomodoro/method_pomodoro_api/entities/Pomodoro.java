package com.pomodoro.method_pomodoro_api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pomodoro")
public class Pomodoro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer minutesOfInterval;

    private Integer minutesOfStudy;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Pomodoro(Integer minutesOfInterval, Integer minutesOfStudy) {
        this.minutesOfInterval = minutesOfInterval;
        this.minutesOfStudy = minutesOfStudy;
    }

    public Pomodoro() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
