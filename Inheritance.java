/*
Run javac filename.java to compile the files
java filename to run the files
*/

// class name must start with capital letter and be the same name as your file
abstract class parent {
  public int age = 10;
  public String name = "Someone";
  public abstract void study(); // abstract method

  // An abstract method belongs to an abstract class, and it does not have a body. 
  // The body is provided by the subclass.
  // Subclass (inherit from Main)
}

class child extends parent {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Methods is defined at the child class.");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    // create an instance of the class
    // Main myobject = new Main(123, "MYNAME");
    // System.out.println(myobject.x);
    // myobject.x = 50;
    // System.out.println(myobject.x);
    // System.out.println(myobject.y);


    // compiled java folders in the same directory
    // Importme importobject = new Importme();
    // System.out.println(importobject.x);
    // importobject.inputmethodsecondclass(23);
    
    // abstract class
    child myobject = new child();
    System.out.println("Name: " + myobject.name);
    System.out.println("Age: " + myobject.age);
    System.out.println("Graduation Year: " + myobject.graduationYear);
    myobject.study();

  }
}
