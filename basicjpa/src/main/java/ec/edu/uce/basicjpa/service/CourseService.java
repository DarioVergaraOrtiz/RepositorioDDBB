package ec.edu.uce.basicjpa.service;

import ec.edu.uce.basicjpa.models.Course;
import ec.edu.uce.basicjpa.models.Person;
import ec.edu.uce.basicjpa.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public void save(Course course){
        courseRepository.save(course);
    }

    public List<Course> findByPerson(Person person){
        return courseRepository.findByPersonsContains(person);
    }
}
