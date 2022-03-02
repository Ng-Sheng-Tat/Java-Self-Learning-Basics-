/*
Run javac filename.java to compile the files
java filename to run the files
*/

// The ArrayList class is a resizable array, which can be found in the java.util package.
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class (to sort the list)


public class Main {

    public static void main(String[] args) {
        ArrayList<String> studentname = new ArrayList<String>();
        studentname.add("Person 1");
        studentname.add("Person 2");
        studentname.add("Person 3");
        studentname.add("Person 4");
        // System.out.println(studentname);
        String firstelement = studentname.get(0);
        
        // System.out.println(firstelement);
        firstelement = "Modified Person";
        // System.out.println(firstelement);
        
        // Alternatively
        studentname.set(0, "Opel");
        // System.out.println(firstelement);
        // System.out.println(studentname);
        
        // remove an item 
        studentname.remove(1);
        // System.out.println(studentname);
        // System.out.println(studentname.size());
        
        // clear a list
        // studentname.clear();
        // System.out.println(studentname);
        // System.out.println(studentname.size());
        
        // loop through a list
        for (int i = 0; i < studentname.size(); i++) {
          System.out.println(studentname.get(i));
        }
        
        // loops using a for each loops
        for (String i : studentname) {
            System.out.println(i);
        }
        
        // Array list for numbers (integer)
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(5);
        myNumbers.add(20);
        myNumbers.add(18);
        Collections.sort(myNumbers); 
        for (int i : myNumbers) {
          System.out.println(i);
        }
        
    }
}