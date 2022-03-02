/*
This is a class
classname must same with filename.java
*/

public class Basics {
  // This is a method
  public static void main(String[] args) {
    // System.out.println("Hello World");
    // Declaring variable
    //In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts with 0x.
    int myint = 10;
    float myfloat = 10.6f;
    double mydouble = 1926.99d, mydouble2 = 12e2d;
    char mychar = 'A';
    boolean mybool = true;
    String mystring = "This is a string";
    mystring = "This is a string ";
    // final keyword declare it is a constant
    final int constantvariable = 5;

    /*
    System.out.println(myint + myint2);
    System.out.println(myfloat + myint);
    System.out.println(mychar);
    System.out.println(mybool);
    System.out.println(mystring+mystring);
    System.out.println(constantvariable);
    System.out.println(mydouuble);
    */

    // The instanceof operator checks whether an object is an instanceof a particular class.
    // System.out.println(mystring instanceof String);

    // ternary operator: shorthand for the if-then-else statement.
    // variable = Expression ? expression1 : expression2
    // String result;
    // result = (27 > 20) ? "27 is bigger" : "27 is smaller";
    // System.out.println(result);

    // Manual Casting
    // double myDouble = 9.78d;
    // int myInt = (int) myDouble;
    // System.out.println(myDouble);
    // System.out.println(myInt);

    // String Methods
    String mystring2 = "This is a string sentences. ";
    // System.out.println(mystring2.length());
    // System.out.println(mystring2.toUpperCase());
    // System.out.println(mystring2.toLowerCase());
    // System.out.println(mystring2.indexOf("string"));

    // Concatenation
    // System.out.println(mystring2 + " " + mystring2);
    // System.out.println(mystring2.concat(" " + mystring2));

    //Special Character
    // System.out.println("\\");
    // System.out.println("\"");

    // Java Math Operations
    int myint1 = 100;
    int myint2 = 49;
    System.out.println(Math.max(myint1, myint2));
    System.out.println(Math.min(myint1, myint2));
    System.out.println(Math.sqrt(myint2));
    System.out.println(Math.abs(-myint2));
    int randomNum = (int)(Math.random() * 101);
    System.out.println(randomNum);
  }
}
