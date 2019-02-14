package com.company;

public class Car {

    private int doors;
    private int wheeels;
    private String model;
    private String engien;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comador")) {
            this.model = model;
        }else{
            System.out.println("model is unknown");
        }
    }

    public String getModel(){
      return this.model;
    }

}
