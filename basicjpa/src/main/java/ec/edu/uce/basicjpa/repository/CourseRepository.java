package ec.edu.uce.basicjpa.repository;

import ec.edu.uce.basicjpa.models.Course;
import ec.edu.uce.basicjpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByPersonsContains(Person person);
}
