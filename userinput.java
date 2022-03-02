/*
Run javac filename.java to compile the files
java filename to run the files
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
        System.out.println("Enter age");
        int userage = myObj.nextInt();
        System.out.println("Age is: " + userage);
        
        System.out.println("Enter salary");
        double usersalary = myObj.nextDouble();
        System.out.println("Salary is: " + usersalary);
        
        System.out.println("Enter the value of pi");
        float pivalue = myObj.nextFloat();
        System.out.println("The value of pi is: " + pivalue);
    }
}