package com.company;

public class Jeep extends Car {
    private boolean lift;
    private boolean snorkal;

    public Jeep(boolean lift, boolean snorkal) {
        super("jeep", "4x4", 4, 5, 5, false);
        this.lift = lift;
        this.snorkal = snorkal;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==0){
            stop();
            changeGear(1);
        }else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        }else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        }else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        }else if(newVelocity>40 && newVelocity<=50){
            changeGear(4);
        }else{
            changeGear(5);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }



    }




}
