package com.sda.she_likes_java.final_project.entity;

import java.time.LocalDate;
import java.util.Objects;

public record User(Long id,
        String name,
                   String surname,
                   LocalDate dateOfBirth,
                   String login, String password,
                   LocalDate drivingLicenceIssueDate) {




}