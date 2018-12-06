package at.ac.fh_kufstein.uebung_04;
import at.ac.fh_kufstein.uebung04.Classes.Bike;

public class Aufruf
{

    public static void main(String[] args)
    {

        Bike b = new Bike("blau", 2, 20.0, 40.0);
        b.accelerate(300);
        b.slowdown(100);
        b.currentSpeed();

    }

}
