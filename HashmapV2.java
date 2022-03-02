/*
Run javac filename.java to compile the files
java filename to run the files
*/

// A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> mydictionary = new HashMap<String, String>();
    mydictionary.put("Index 1", "Person 1");
    mydictionary.put("Index 2", "Person 2");
    mydictionary.put("Index 3", "Person 3");
    
    String person3 = mydictionary.get("Index 3");
    
    // System.out.println(mydictionary);
    // System.out.println(person3);
    // mydictionary.remove("Index 2");
    // System.out.println(mydictionary);
    // mydictionary.clear();
    // System.out.println(mydictionary);
    
    int dictsize = mydictionary.size();
    System.out.println(dictsize);
    
    // print keys
    for (String i : mydictionary.keySet()) {
      System.out.println(i);
      System.out.println(mydictionary.keySet());
    }
    
    // print values
    for (String j : mydictionary.values()) {
      System.out.println(j);
      System.out.println(mydictionary.values());
    }
    
    // Print keys and values
    for (String k : mydictionary.keySet()) {
      System.out.println("key: " + k + " value: " + mydictionary.get(k));
    }
        
    
  }
}
