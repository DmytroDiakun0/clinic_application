package ua.practice_projects.clinic_application.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Schedule {
    private int id;

    private int doctorId;

    private int officeId;

    // date when this schedule becomes active
    @NotBlank
    private String startDate;

    // date when this schedule is over
    @NotBlank
    private String endDate;

    // start time of shift (from Mon to Sun)
    @NotBlank
    private String[] startTime;

    // end time of shift (from Mon to Sun)
    @NotBlank
    private String[] endTime;
}
