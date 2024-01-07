package ua.practice_projects.clinic_application.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.practice_projects.clinic_application.models.Schedule;

public interface ScheduleRepository extends CrudRepository<Schedule, Integer> {}