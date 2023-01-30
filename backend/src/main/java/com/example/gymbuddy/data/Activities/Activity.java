package com.example.gymbuddy.data.Activities;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(schema = "application", name = "activities")
public class Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private String code;

    @Basic
    @Column(name = "label")
    private String label;

    @Basic
    @Column(name = "description")
    private String description;
}
