package ec.edu.uce.basicjpa.service;
import ec.edu.uce.basicjpa.models.Book;
import ec.edu.uce.basicjpa.models.Person;
import ec.edu.uce.basicjpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void save(Book book){
        bookRepository.save(book);
    }

    public List<Book> findByPerson(Person person){
        return bookRepository.findByPerson(person);
    }
}
