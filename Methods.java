/*
Run javac filename.java to compile the files
java filename to run the files
*/

public class Methods {
  // user-define methods
  static void myMethod(String parameter) {
    System.out.println(parameter + " is written inside a user-define methods which can be called at will. ");
  }


  static void myMethodSum(int val1, int val2) {
    int summation = val1 + val2;
    System.out.println(summation);
  }

  // return a value
  static int myMethodMul(int val1, int val2) {
    int multiplication = val1 * val2;
    return multiplication;
  }

  // Multiple methods can have the same name as long as the number and/or type of parameters are different.
  // Overload it
  static double myMethodMul(double val1, double val2) {
    double multiplication = val1 * val2;
    return multiplication;
  }

  // This is a method named main, which will be called automatically when Java files run
  public static void main(String[] args) {
    myMethod("Lisa");
    myMethodSum(1,2);
    System.out.println(myMethodMul(5,6));
    System.out.println(myMethodMul(5.5,6.4));
  }
}
