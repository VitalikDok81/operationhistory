package ru.netology.vdokuchaev.operationhistory.service;

import org.springframework.stereotype.Service;
import ru.netology.vdokuchaev.operationhistory.domain.Customer;
import ru.netology.vdokuchaev.operationhistory.domain.Operation;

import java.util.ArrayList;
import java.util.List;
@Service
public class OperationService {
    public OperationService(){
        List<Operation> operation;
        operation = new ArrayList<>();
        operation.add(new Operation( naznach: "оплата 1"));
        operation.add(new Operation( naznach: "оплата 2"));
        operation.add(new Operation( naznach: "оплата 3"));
    }

        public List<Operation> getOperation(){
            return operation;
        }

        public Customer getOperation(int id){
            return operation.get(id);
        }

    }
