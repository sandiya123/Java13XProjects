package July7th;

public class InterfaceConstants {
    public static void main(String[] args)
    {
        Car1 mycar = new Car1();
        mycar.showSpeedLimit();
    }
}
interface SpeedLimit
{
    int MAX_SPEED = 120; // implicitly public, static, and final
}

// Class accessing the interface constant
class Car1 implements SpeedLimit
{
    void showSpeedLimit()
    {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}
