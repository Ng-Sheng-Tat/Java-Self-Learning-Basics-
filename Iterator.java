/*
Run javac filename.java to compile the files
java filename to run the files
*/

// The iterator() method can be used to get an Iterator for any collection:

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(cars);
    System.out.println(it.next());
    // cars.set(0, "Mazda");
    
    // Collections.sort(cars);
    // Exception will occur
    
    // System.out.println(cars);
    System.out.println(it.next());
    
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
