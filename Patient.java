package org.colleg.practice2.task5;

import java.time.LocalDate;
public class Patient {
    private String name;
    private LocalDate dateOfBirth;
    private String healthStatus;

    public Patient(String name, LocalDate dateOfBirth, String healthStatus) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
}
