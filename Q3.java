import java.util.Scanner; 

public class Main {
  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
  double mulanswer = 1;
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    double mulanswer = 1;
    for (int i = 1; i < 11; i++) {
      System.out.println(i + " enter multiplication number: ");
      double temp = myObj.nextDouble();
      mulanswer *= temp;
    }
    System.out.println(mulanswer);
  }
  
}