package July4thTasks;

public class PrivateAccess {
    String name = "sandhya";
    private  int BankBalance=1000;


    int getBankBalance(){
        return BankBalance;
    }


}

class normal extends PrivateAccess {
    public static void main(String[] args) {
        PrivateAccess privateAccess = new PrivateAccess();
        System.out.println(privateAccess.getBankBalance());

    }
}
