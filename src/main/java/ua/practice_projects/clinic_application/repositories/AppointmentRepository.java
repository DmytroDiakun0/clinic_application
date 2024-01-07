package ua.practice_projects.clinic_application.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.practice_projects.clinic_application.models.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {}