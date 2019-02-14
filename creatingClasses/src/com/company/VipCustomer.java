package com.company;

public class VipCustomer {

    public String customerName;
    public double  creditLimit;
    public String customerEmail;


    public VipCustomer(){
        this("Phill", 1000000, "youGetNothing@gmail.com");
    }

    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "unknowen@gmail.com");
    }
    public VipCustomer(String customerName, double creditLimit, String customerEmail){
        this.creditLimit = creditLimit;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }


    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }





}
