/*
Run javac filename.java to compile the files
java filename to run the files
*/

// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    // Use addFirst() to add the item to the beginning
    cars.addFirst("First");
    cars.addLast("Last");
    System.out.println(cars);
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
    cars.removeFirst();
    cars.removeLast();
    System.out.println(cars);
    
    
  }
}
