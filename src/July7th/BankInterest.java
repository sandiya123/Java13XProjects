package July7th;

public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new Sbi();
        sbi.getInterestRate();

        Bank hdfc = new Hdfc();
        hdfc.getInterestRate();
    }

}

abstract class Bank {

    abstract void getInterestRate();


}
class Sbi extends Bank{
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class Hdfc extends Bank{

    void getInterestRate()
    {
        System.out.println("hdfc Interest Rate: 7.5%");
    }

}
