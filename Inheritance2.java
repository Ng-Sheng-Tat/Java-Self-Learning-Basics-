/*
Run javac filename.java to compile the files
java filename to run the files
*/

class parent {
    protected String name = "ABC";
    // static method
    static void Staticmethod() {
    System.out.println("Static method from parent.");
    }
}

class child extends parent {
    public int age = 23;
}


public class Main {
    
    public static void main(String[] args) {
        child myobject = new child();
        myobject.Staticmethod();
        System.out.println(myobject.name);
        System.out.println(myobject.age);   
    }
}