package ru.netology.vdokuchaev.operationhistory.service;

import org.springframework.stereotype.Service;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {

    public CustomerService(){
        List<Customer> customers;
        customers = new ArrayList<>();
        customers.add(new Customer("Клиент 1"));
        customers.add(new Customer("Клиент 2"));
        customers.add(new Customer("Клиент 3"));
    }

    public List<Customer> getCustomer(){
        return customers;
    }

    public Customer getCustomer(int id){
        return customers.get(id);
    }


}
