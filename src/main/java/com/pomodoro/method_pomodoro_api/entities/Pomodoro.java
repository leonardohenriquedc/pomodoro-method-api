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
    @Column(name = "user_id")
    private User user;

    public Pomodoro(Integer minutesOfInterval, Integer minutesOfStudy, User user) {
        this.minutesOfInterval = minutesOfInterval;
        this.minutesOfStudy = minutesOfStudy;
        this.user = user;
    }

    public Pomodoro() {
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
