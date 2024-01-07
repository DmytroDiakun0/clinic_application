package ua.practice_projects.clinic_application.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
    private int id;

    @Size(min = 10, max = 13)
    private String phoneNumber;

    @Size(min = 8)
    private String password;

    @NotBlank
    private String role;

    @NotBlank
    private String surname;

    @NotBlank
    private String firstname;

    @NotBlank
    private String middlename;

    @NotBlank
    private String specialization;
}
