package ua.practice_projects.clinic_application;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Appointment {
    private int id;

    private int doctorId;

    private int patientId;

    @NotBlank
    private String date;

    @NotBlank
    private String startTime;

    @NotBlank
    private String endTime;
}
