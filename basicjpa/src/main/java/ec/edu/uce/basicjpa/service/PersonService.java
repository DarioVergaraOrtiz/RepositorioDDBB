package ec.edu.uce.basicjpa.service;

import ec.edu.uce.basicjpa.models.Person;
import ec.edu.uce.basicjpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void save(Person person){
        personRepository.save(person);
    }

    public Optional<Person> findbyId(long id){
        Optional<Person> person = personRepository.findById(id);
        return person;
    }

    public List<Person> findbyName(String name){
        List<Person> person = personRepository.findByName(name);
        return person;
    }

    public List<Person> findByLastname(String name){
        List<Person> person = personRepository.findByLastname(name);
        return person;
    }

    public List<Person> findByAge(int age){
        List<Person> person = personRepository.findByAge(age);
        return person;
    }


}