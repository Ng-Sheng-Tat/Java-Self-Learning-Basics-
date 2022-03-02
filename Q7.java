public class Main {
    
  public static void main(String[] args) {
    int summation = 0;
    for (int i = 0; i <= 10; i = i + 1) {
        if (i%2 == 0) {
            summation += i;
        }
    }
    System.out.println(summation);
  }
}