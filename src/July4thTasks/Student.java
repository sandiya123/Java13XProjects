package July4thTasks;

public class Student {
    public static void main(String[] args) {
        Student1 s=new Student1();
        s.showDetails();
    }
}

class Student1{
    void showDetails(){

    System.out.println("Public Access: Student Info");
}}

class TestDefault {

    void showDefault() {
        System.out.println("Show Test Default method");
    }
}