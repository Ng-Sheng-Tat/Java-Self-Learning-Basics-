/*
Run javac filename.java to compile the files
java filename to run the files
*/

public class Main {
    enum LEVEL {
        level1, 
        level2, 
        level3
    }
    public static void main(String[] args) {
        LEVEL myvariable = LEVEL.level2;
        switch (myvariable) {
            case level1:
                System.out.println("Option 1");
                break;
            case level2:
                System.out.println("Option 2");
                break;
            case level3:
                System.out.println("Option 3");
                break;    
        }
        // The enum type has a values(), loops through enumeration
        for (LEVEL myVar : LEVEL.values()) {
          System.out.println(myVar);
        }
    }
}