/*
Run javac filename.java to compile the files
java filename to run the files
*/

// The ArrayList class is a resizable array, which can be found in the java.util package.
import java.util.HashMap; // java dictionary


public class Main {

    public static void main(String[] args) {
        HashMap<String, String> mydictionaries = new HashMap<String, String>();
        mydictionaries.put("Name", "Someone");
        mydictionaries.put("Age", "Someage");
        mydictionaries.put("Date", "Someday");
        // System.out.println(mydictionaries);
        String whatname = mydictionaries.get("Name");
        System.out.println(whatname);
        String removename = mydictionaries.remove("Name");
        System.out.println(removename);
        System.out.println(mydictionaries);
        mydictionaries.clear();
        System.out.println(mydictionaries);
    }
}