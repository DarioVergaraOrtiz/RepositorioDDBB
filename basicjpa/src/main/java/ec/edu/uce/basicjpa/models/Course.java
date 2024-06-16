package ec.edu.uce.basicjpa.models;

import jakarta.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;

    // Relación muchos a muchos con Person
    @ManyToMany(mappedBy = "courses")
    private List<Person> persons;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", persons=" + persons.stream().map(Person::getName).collect(Collectors.toList()) +
                '}';
    }

}
