package ua.practice_projects.clinic_application;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Office {
    private int id;

    @NotBlank
    private String type;

    @Min(1)
    private int floor;

    @Min(1)
    private int number;
}
