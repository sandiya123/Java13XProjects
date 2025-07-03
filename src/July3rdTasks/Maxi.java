package July3rdTasks;

public class Maxi {

    public static void main(String[] args) {

        Utility u1=new Utility();
        u1.max(4,5);
        u1.max(7,9,2);

    }
}
class Utility {
    int max(int a, int b)
    {
     int max=(a > b) ? a : b;
        System.out.println(max);
        return max;
    }
    int max(int a, int b,int c)
    {
        int max=(a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);
        return max;
    }




}
