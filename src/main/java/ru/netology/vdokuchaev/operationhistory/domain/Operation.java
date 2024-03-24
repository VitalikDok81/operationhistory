package ru.netology.vdokuchaev.operationhistory.domain;

public class Operation {
    String naznach;
    public long id_operation;
    public long Customer_id;

    public String getName(){
        return naznach;
    }
    public void setName(String naznach){
        this.naznach = naznach;
    }
    public Operation(String naznach) {
        this.naznach = naznach;
    }
}
