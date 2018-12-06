package at.ac.fh_kufstein.uebung04.Classes;

public class Car
{

    private String color;
    private int wheels;
    private double speed;

    public Car(String color, int wheels, double speed){
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    public Car(){}

    public void currentSpeed()
    {
        System.out.println("Die Geschwindigkeit beträgt: " + this.speed);
    }

}
