package ua.practice_projects.clinic_application.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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

    @Column(name = "doctor_id")
    @Min(0)
    @ManyToOne
    private int doctorId;

    @Column(name = "patient_id")
    @Min(0)
    @ManyToOne
    private int patientId;

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
