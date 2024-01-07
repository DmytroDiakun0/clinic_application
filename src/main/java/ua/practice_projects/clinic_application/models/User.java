package ua.practice_projects.clinic_application.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Entity
@Table(name = "app_user")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class User {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "phone_number")
    @Size(min = 10, max = 13)
    private String phoneNumber;

    @Column(name = "password")
    @Size(min = 8)
    private String password;

    @Column(name = "role")
    @NotBlank
    private String role;

    @Column(name = "surname")
    @NotBlank
    private String surname;

    @Column(name = "firstname")
    @NotBlank
    private String firstname;

    @Column(name = "middlename")
    @NotBlank
    private String middlename;

    @Column(name = "specialization")
    @NotBlank
    private String specialization;
}
