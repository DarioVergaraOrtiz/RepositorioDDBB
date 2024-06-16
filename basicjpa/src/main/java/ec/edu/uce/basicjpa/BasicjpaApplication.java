package ec.edu.uce.basicjpa;

import ec.edu.uce.basicjpa.models.Address;
import ec.edu.uce.basicjpa.models.Book;
import ec.edu.uce.basicjpa.models.Course;
import ec.edu.uce.basicjpa.models.Person;
import ec.edu.uce.basicjpa.service.BookService;
import ec.edu.uce.basicjpa.service.CourseService;
import ec.edu.uce.basicjpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BasicjpaApplication implements CommandLineRunner {

	@Autowired
	PersonService service;
	@Autowired
	BookService bookService;
	@Autowired
	CourseService courseService;


	public static void main(String[] args) {
		SpringApplication.run(BasicjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

// Crear una dirección
		Address address = new Address();
		address.setStreet("Calle 123");
		address.setCity("Quito");
		address.setCountry("Ecuador");

// Crear una persona
		Person person = new Person(1, "Naidelin", "Tabango", 20);
		person.setAddress(address); // Establecer la relación

// Crear un libro
		Book book = new Book();
		book.setTitle("El principito");
		book.setPerson(person); // Establecer la relación

// Guardar el libro
		bookService.save(book);

// Crear un curso
		Course course = new Course();
		course.setName("Matemáticas");

// Establecer la relación
		List<Person> students = new ArrayList<>();
		students.add(person);
		course.setPersons(students);

// Guardar el curso
		courseService.save(course);

// Ahora guardar la persona
		service.save(person);


		// Ahora puedes buscar y ver las relaciones
		Optional<Person> personId = service.findbyId(1);
		System.out.println("Dato encontrado: " + personId.toString());

		// Aquí puedes ver la dirección de la persona
		System.out.println("Dirección de la persona: " + personId.get().getAddress().toString());

		// Y aquí puedes ver los libros de la persona
		List<Book> books = bookService.findByPerson(personId.get());
		System.out.println("Libros de la persona: " + books.toString());

		// Y aquí puedes ver los cursos de la persona
		List<Course> personCourses = courseService.findByPerson(personId.get());
		System.out.println("Cursos de la persona: " + personCourses.toString());
	}

}

