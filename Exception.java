/*
Run javac filename.java to compile the files
java filename to run the files
*/

// uses the throw keyword, to customize your exceotion error message when error is detected. 

// try-and-except error that is forseen

public class Main {
 
    public static void main(String[] args) {

        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
        } catch (Exception e) {
          System.out.println("There is no 10 values stored");
        } finally {
          System.out.println("Try and Except Block Finished, Error was identified. ");   
        }
        System.out.println("Try and Except Block Finished, Error was identified. "); 
    
  
  }
}
