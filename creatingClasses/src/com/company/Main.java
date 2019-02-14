package com.company;

public class Main {

    public static void main(String[] args) {
//	    Car porsche = new Car();
//	    Car holden = new Car();
//	    porsche.setModel("911");
//
//        System.out.println(porsche.getModel());

        //Account bobsAccount = new Account("12234", 0.00, "my name", "me@gmail.com", "(720)352-1928");
        Account bobsAccount = new Account();
        bobsAccount.deposit(100);
        bobsAccount.withdrawal(10.00);
        System.out.println(bobsAccount.getCustomerEmailAddress());
        System.out.println(bobsAccount.getCustomerName());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("bob", 4000);
        System.out.println(person2.getCustomerName() + " and " + person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Nptbob", 400000, "yay@gmail.com");
        System.out.println(person3.getCustomerName() + " and " + person3.getCreditLimit() + " and " + person3.getCustomerEmail());
    }
}
