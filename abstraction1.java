/*
Run javac filename.java to compile the files
java filename to run the files
*/

// Abstract class: is a restricted class that cannot be used to create objects (to access it, 
// it must be inherited from another class),  it is not possible to create an object of the Animal class

// Abstraction can also be achieved with Interfaces, which you will learn more about in the next chapter.

// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


abstract class parent {
  // Abstract method (does not have a body)
  public abstract void abstractmethod();
  // Regular method
  public void staticmethod() {
    System.out.println("Static Method is called. ");
  }
}

class child extends parent {
  public void abstractmethod() {
    // The body of animalSound() is provided here
    System.out.println("Abstraction method is being called. ");
  }
}

public class Main {
    
    public static void main(String[] args) {
        child myobject = new child();
        myobject.staticmethod();
        myobject.abstractmethod();
        
        
    }
}