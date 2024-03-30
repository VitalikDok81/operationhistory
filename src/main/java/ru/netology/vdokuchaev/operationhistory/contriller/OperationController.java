package ru.netology.vdokuchaev.operationhistory.contriller;

import org.springframework.web.bind.annotation.*;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;
import ru.netology.vdokuchaev.operationhistory.domain.Operation;
import ru.netology.vdokuchaev.operationhistory.service.AsyncIntupOperationService;
import ru.netology.vdokuchaev.operationhistory.service.CustomerService;
import ru.netology.vdokuchaev.operationhistory.service.OperationService;

@RestController
@RequestMapping(path = "api/operations")
public class OperationController {
    public final AsyncIntupOperationService service;

    public OperationController(AsyncIntupOperationService service){
        this.service = service;
    }
    @PostMapping
    public void createOperation (@RequestBody Operation operation) {
        service.addOperation(operation);
    }
}
