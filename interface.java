/*
Run javac filename.java to compile the files
java filename to run the files
*/

// interface is a completely "abstract class" that is used to group related methods with empty bodies

interface abstractclass {
    public void abstractmethod1(); // interface method (does not have a body)
    public void abstractmethod2(); // interface method (does not have a body)
}

// multiple interface
interface abstractclass2 {
    public void abstractmethod3(); // interface method (does not have a body)
}

/*
"implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class.
*/

class absmed1 implements abstractclass, abstractclass2 {
    public void abstractmethod1() {
        System.out.println("Method 1 Definition");
    }
    public void abstractmethod2() {
        System.out.println("Method 2 Definition");
    }
    public void abstractmethod3() {
        System.out.println("Method 3 Definition");
    }
    
}
public class Main {
    
    public static void main(String[] args) {
        absmed1 myobject = new absmed1();
        myobject.abstractmethod1();
        myobject.abstractmethod2();
        myobject.abstractmethod3();
        
        
    }
}