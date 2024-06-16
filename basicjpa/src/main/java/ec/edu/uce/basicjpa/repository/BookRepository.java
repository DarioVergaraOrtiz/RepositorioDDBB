package ec.edu.uce.basicjpa.repository;

import ec.edu.uce.basicjpa.models.Book;
import ec.edu.uce.basicjpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPerson(Person person);
}