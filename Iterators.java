/*
Run javac filename.java to compile the files
java filename to run the files
*/

// The ArrayList class is a resizable array, which can be found in the java.util package.
import java.util.HashSet; 
// A HashSet is a collection of items where every item is unique, and it is found in the java.util package


public class Main {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        boolean myboolean = cars.contains("Mazda");;
        // System.out.println(myboolean);
        cars.remove("Volvo");
        System.out.println(cars);
        // cars.clear();
        // System.out.println(cars);
        int mysize = cars.size();
        System.out.println(mysize);
        
        // iterations using for each loops
        for (String i : cars) {
            System.out.println(i);
        }
        
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
          if(numbers.contains(i)) {
            System.out.println(i + " was found in the set.");
          } else {
            System.out.println(i + " was not found in the set.");
          }
        }
    }
}