package July7th;

public class InterfaceWithDefaultAndStaticMethod {
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.start();
        Vehicle.fuelType();

    }
}
interface Vehicle
{
    // Default method
    default void start()
    {
        System.out.println("Vehicle started");
    }

    // Static method
    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}

// Class implementing the interface
class Car implements Vehicle
{

}