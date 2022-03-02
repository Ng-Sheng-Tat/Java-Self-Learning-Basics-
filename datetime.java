/*
Run javac filename.java to compile the files
java filename to run the files
*/
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {

    public static void main(String[] args) {
        LocalDate mydateobj = LocalDate.now(); // Create a date object
        System.out.println("Current Data is " + mydateobj); // Display the current date
        
        LocalTime mytimeobj = LocalTime.now();
        System.out.println("Current time is " + mytimeobj); 
        
        LocalDateTime mydatetimeobj = LocalDateTime.now();
        System.out.println("Current date and time is " + mydatetimeobj); 
        
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM-dd (yyyy)");
        String formattedDate = mydatetimeobj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}