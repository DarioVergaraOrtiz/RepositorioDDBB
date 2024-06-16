package ec.edu.uce.basicjpa.repository;

import ec.edu.uce.basicjpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByName(String name);
    List<Person> findByLastname(String lastname);
    List<Person> findByAge(int age);

}
