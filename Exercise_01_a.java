package Chapter_9_a;
/*
Write a class SportUtilityVehicle that relates to the Car class from Self-Check Problems 9 and 10 and whose
methods have the following behavior. Whenever possible, use inheritance to reuse behavior from the superclasses.
Method Output/Return
m1 SUV 1
m2 car 1
toString "SUV vroom"
 */

public class Exercise_01_a
{
    public static void main(String[] args)
    {
        Suv mySuv = new Suv();

        mySuv.m1();
        mySuv.m2();
        System.out.println(mySuv);

    }


}
