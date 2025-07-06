package July4thTasks;

public class Program3 {

    public int a=50;

    public static void main(String[] args) {
        Pvar p2 = new Pvar();

        p2.add();
    }
}


class Pvar extends Program3 {
    void add(){
       int a=40;
       int b=20;
        System.out.println("::::"+(super.a+b));
    }


}
