package July3rdTasks;

public class Universalprinter {

    public static void main(String[] args) {

        Printer p1=new Printer();
        p1.printData(3);
        p1.printData("Sandhya");
        p1.printData(2.98F);

    }

}
class Printer{
    String printData(String data) {
        System.out.println("String Datatype!");
        return data;
    }


    int printData(int data)

    {
        System.out.println("int Datatype!");
        return data;
    }

    float printData(float data)
    {
        System.out.println("float Datatype!");
        return data;
    }

}
