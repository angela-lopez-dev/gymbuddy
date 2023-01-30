package com.example.gymbuddy.data.Events;

import com.example.gymbuddy.data.Activities.Activity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;

@Entity
@Getter
@Table(schema = "application", name = "events")
public class Event {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "activity_id", nullable = false)
    private Activity activity;

    @Basic
    @Column(name = "date")
    private LocalDateTime date;

    @Basic
    @Column(name = "organizer_id")
    private int organizerId;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "location")
    private String location;
}
