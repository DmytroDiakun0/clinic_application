package ua.practice_projects.clinic_application.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "appointment")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Appointment {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "doctor_id")
    @NotNull
    @ManyToOne
    private User doctorId;

    @JoinColumn(name = "patient_id")
    @NotNull
    @ManyToOne
    private User patientId;

    @Column(name = "appointment_date")
    @NotBlank
    private String date;

    @Column(name = "start_time")
    @NotBlank
    private String startTime;

    @Column(name = "end_time")
    @NotBlank
    private String endTime;
}
