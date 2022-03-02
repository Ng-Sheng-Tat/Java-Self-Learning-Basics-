/*
Run javac filename.java to compile the files
java filename to run the files
*/

// A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> myset = new HashSet<String>();
    myset.add("Person 1");
    myset.add("Person 2");
    myset.add("Person 3");
    myset.add("Person 1");
    
    System.out.println(myset);
    myset.remove("Person 2");
    System.out.println(myset);
    System.out.println(myset.contains("Person 1"));
    System.out.println(myset.contains("Person 5"));
    myset.clear();
    System.out.println(myset);
    
  }
}
