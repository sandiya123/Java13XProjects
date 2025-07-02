package July2ndInheritance;

public class VehicleconsChain {
    public static void main(String[] args) {

        Bike b=new Bike();


    }



}

class Vehicle{
    Vehicle()
   {
       System.out.println("Vehicle is READY");
   }

}

class Bike extends Vehicle{
    Bike()
    {
        System.out.println("Bike is READY");
    }

}
