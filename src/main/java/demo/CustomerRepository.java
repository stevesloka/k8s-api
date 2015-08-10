package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Organizer, Long> {

    List<Organizer> findByLastName(String lastName);
}