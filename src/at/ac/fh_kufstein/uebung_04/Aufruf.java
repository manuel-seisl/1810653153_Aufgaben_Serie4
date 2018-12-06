package at.ac.fh_kufstein.uebung_04;
import at.ac.fh_kufstein.uebung04.Classes.Bike;
import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf
{

    public static void main(String[] args)
    {

        Bike b = new Bike("blau", 2, 20.0, 40.0);
        b.accelerate(10);
        b.currentSpeed();

    }

}
