/*
Run javac filename.java to compile the files
java filename to run the files
*/

// Sometimes you must use wrapper classes, for example when working with Collection objects, 
// such as ArrayList, where primitive types cannot be used (the list can only store objects):

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {

    // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 
    
    // Creating a wrapper object, since they are object, they have methods that can be used
    Integer myint = 5;
    Double mydouble = 2.33;
    Character mycharacter = 'A';
    
    System.out.println(myint.intValue());
    System.out.println(mydouble.doubleValue());
    System.out.println(mycharacter.charValue());
    
    // data type casting
    String myString = myint.toString();
    System.out.println(myString.length());
  }
}
