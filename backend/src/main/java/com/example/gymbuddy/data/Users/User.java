package com.example.gymbuddy.data.Users;

import jakarta.persistence.*;

@Entity
@Table(schema = "application", name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "login")
    private String login;
}
