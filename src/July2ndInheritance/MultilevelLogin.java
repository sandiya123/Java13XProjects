package July2ndInheritance;

public class MultilevelLogin {

    public static void main(String[] args) {

        SuperAdmin sa=new SuperAdmin();
        sa.shutdownSystem();
        sa.login();
        sa.accessAdminPanel();

    }

    }

    class User{
        void login()
        {
            System.out.println("User Login");
        }

    }

    class AdminUser extends User{
    void accessAdminPanel()
    {
        System.out.println("Access Admin Panel");
    }
    }

    class SuperAdmin extends AdminUser{
     void shutdownSystem()
     {
         System.out.println("shut down the system");
     }
    }
