package demo.Controllers;

import demo.CustomerRepository;
import demo.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizersController {

    @Autowired
    CustomerRepository repository;

    @RequestMapping("/organizers")
    public Iterable<Organizer> organizers() {
        return repository.findAll();
    }
}