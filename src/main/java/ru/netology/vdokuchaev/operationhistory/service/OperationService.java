package ru.netology.vdokuchaev.operationhistory.service;

import org.springframework.stereotype.Service;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;
import ru.netology.vdokuchaev.operationhistory.domain.Operation;

import java.util.ArrayList;
import java.util.List;
@Service
public class OperationService {
    List<Operation> operation;

    public OperationService(){
        operation = new ArrayList<>();
        operation.add(new Operation( "оплата 1"));
        operation.add(new Operation( "оплата 2"));
        operation.add(new Operation( "оплата 3"));
    }

    public List<Operation> getOperation(){
            return operation;
        }

    public Operation getOperation(int id){
            return operation.get(id);
        }
    public void saveOperation(Operation operation){

    }

}
