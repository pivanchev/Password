
package passwords;
import java.util.Scanner;

public class Passwords {

    
    public static void main(String[] args) {
 
    String Username = "Alex";
    String Password = "qwerty";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.nextLine();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.nextLine();

    if (username.equals(Username) && password.equals(Password)) {
        System.out.println("Access Granted! Welcome!");
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

}

}