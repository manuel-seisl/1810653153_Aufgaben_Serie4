package at.ac.fh_kufstein.uebung04.Classes;

public class Bike extends Car
{

    double maxspeed;

    public Bike(String color, int wheels, double speed, double maxspeed)
    {
        super(color, wheels, speed);
        this.maxspeed = maxspeed;
    }

    public Bike(){}

    public double getMaxspeed()
    {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed)
    {
        this.maxspeed = maxspeed;
    }

    public void accelerate(double speed)
    {

        double newspeed = super.speed += speed;

        if(newspeed > this.maxspeed){
            System.out.println("Höchstgeschwindikeit erreicht!");
            super.speed = maxspeed;
        } else {
            super.speed += speed;
        }

    }

    public void slowdown(double speed)
    {

        double newspeed = super.speed -= speed;

        if(newspeed < 0){
            System.out.println("Bike steht jetzt");
            super.speed = 0;
        } else {
            super.speed -= speed;
        }

    }

}
