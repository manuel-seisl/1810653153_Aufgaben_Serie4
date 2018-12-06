package at.ac.fh_kufstein.uebung04.Classes;

public class Bike extends Car
{

    double maxspeed;

    public Bike(String color, int wheels, double speed, double maxspeed)
    {
        super(color, wheels, speed);
        this.maxspeed = maxspeed;
    }

    public double getMaxspeed()
    {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed)
    {
        this.maxspeed = maxspeed;
    }

    public Bike(){}

}
