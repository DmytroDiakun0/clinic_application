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
@Table(name = "schedule")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Schedule {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "doctor_id")
    @NotNull
    @ManyToOne
    private User doctorId;

    @JoinColumn(name = "office_id")
    @NotNull
    @ManyToOne
    private Office officeId;

    // date when this schedule becomes active
    @Column(name = "start_date")
    @NotBlank
    private String startDate;

    // date when this schedule is over
    @Column(name = "end_date")
    @NotBlank
    private String endDate;

    // start time of shift (from Mon to Sun)
    @Column(name = "start_time")
    @NotBlank
    private String[] startTime;

    // end time of shift (from Mon to Sun)
    @Column(name = "end_time")
    @NotBlank
    private String[] endTime;
}
