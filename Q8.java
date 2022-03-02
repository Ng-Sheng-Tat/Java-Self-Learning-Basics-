import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    int count = 0;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = myObj.nextInt();
    System.out.println("Enter the value of b:");
    int b = myObj.nextInt();
    System.out.println("Enter the value of c:");
    int c = myObj.nextInt();
    
    for (int i = a; i <= b; i = i + 1) {
        if (i%c == 0) {
            count += 1;
        }
    }
    System.out.println(count);
  }
}