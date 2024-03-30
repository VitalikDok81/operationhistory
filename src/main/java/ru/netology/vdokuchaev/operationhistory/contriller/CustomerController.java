package ru.netology.vdokuchaev.operationhistory.contriller;
import org.springframework.web.bind.annotation.*;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;
import ru.netology.vdokuchaev.operationhistory.service.CustomerService;
import java.util.List;

@RestController
@RequestMapping(path = "api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService service){
        this.customerService = service;
    }

    @GetMapping
    public List<Customer> getCustomer(){
        return  customerService.getCustomer();
    }

    @GetMapping ("{id}")
    public Customer getCustomer(@PathVariable("id") int id) {
        return customerService.getCustomer(id);
    }
    @PostMapping
    public void createCustomer (@RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }

}
