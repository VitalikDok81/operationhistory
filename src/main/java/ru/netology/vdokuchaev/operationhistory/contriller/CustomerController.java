package ru.netology.vdokuchaev.operationhistory.contriller;
import org.springframework.web.bind.annotation.*;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;
import ru.netology.vdokuchaev.operationhistory.service.CustomerService;
import java.util.List;

@RestController
@RequestMapping(path = "api/customers")
public class CustomerController {
    public final CustomerService service;

    public CustomerController(CustomerService service){
        this.service = service;
    }

    @GetMapping
    public List<Customer> getCustomer(){
        return  service.getCustomer();
    }

    @GetMapping ("{id}")
    public Customer getCustomer(@PathVariable("id") int id) {
        return service.getCustomer(id);
    }
    @PostMapping
    public void createCustomer (@RequestBody Customer customer) {
        service.createCustomer(customer);
    }


}
