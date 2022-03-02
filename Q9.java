public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
____________________________________________________________
// Own with imperfections
import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Please enter a value to check:");
    int num = myObj.nextInt();
    if (num >= 2) {
        for (int i=2; i<num; i++) {
            if (num%i == 0) {
                System.out.println(num + " is a prime number. ");
            } else {
                System.out.println(num + " is not a prime number. ");
            }
        }
    }
    
  }
}