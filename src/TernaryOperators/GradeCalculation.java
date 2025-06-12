package TernaryOperators;

public class GradeCalculation {
    public static void main(String[] args) {
        int Marks =65;

        String grade=(Marks>=90)?"A+":(Marks<90 && Marks>=75)?"A":
                (Marks<75 && Marks>=60)?"B":(Marks<60 && Marks>=40)?"C":"Fail";

        System.out.println(grade);

    }
}
