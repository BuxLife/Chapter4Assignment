package com.buxlife.chapter4assignment;

public class Customer{

    private int customerID;

    public Customer()
    {
        Person customer = new Person("Jen","Day", "Female", 24);

    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

}