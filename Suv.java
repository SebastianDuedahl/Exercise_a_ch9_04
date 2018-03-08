package Chapter_9_a;

public class Suv extends Truck
{
    public void m1(){

        System.out.println("SUV 1");

    }
    public void m2(){

        super.m1();
        super.m2();

    }public String toString(){

        return "SUV " + super.toString();
}

}
