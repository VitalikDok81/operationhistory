package ru.netology.vdokuchaev.operationhistory.domain;

public class Customer {
    String name;
    long Customer_id;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Customer(String name) {
        this.name = name;
    }
    public Customer(){}

}
