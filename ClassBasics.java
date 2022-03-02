/*
Run javac filename.java to compile the files
java filename to run the files
*/

// class name must start with capital letter and be the same name as your file
public class ClassBasics {
  // class and inheritance
  // create an attribute of the class main
  int x = 10;

  // use in class constructor
  int y;
  String name;

  // create a method of the class main
  static void mymethod() {
    System.out.println("Calling me by invoking a function. ");
  }

  // a static method, which means that it can be accessed without creating an object of the class,
  // unlike public, which can only be accessed by objects

  // static method
  static void Staticmethod() {
    System.out.println("Static method can be called without creating an object. ");
  }

  // Public method
  public void Publicmethod() {
    System.out.println("Public methods must be called by creating objects. ");
  }

  // input parameter with public method
  public void inputmethod(int numbers) {
    System.out.println(numbers + " is an input parameter.");
  }

  // the constructor name must match the class name,
  // and it cannot have a return type (like void).
  public Main(int z, String val) {
    // a conventional methods
    name = val;
    y = 15;
    // z is not accesible outside this function and will not be considered as one of the attributes of the object
    System.out.println(name + " is initialized by " + z);

  }


  // This is a method named main, which will be called automatically when Java files run
  public static void main(String[] args) {
    // create an instance of the class
    Main myobject = new Main(123, "MYNAME");
    // System.out.println(myobject.x);
    // myobject.x = 50;
    // System.out.println(myobject.x);
    System.out.println(myobject.y);

    // Calling a function
    // mymethod();

    // compiled java folders in the same directory
    // Importme importobject = new Importme();
    // System.out.println(importobject.x);
    // importobject.inputmethodsecondclass(23);

    // Staticmethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    // Main myobject = new Main(); // Create an object of Main
    // myobject.Staticmethod();
    // myobject.Publicmethod(); // Call the public method on the object
    // myobject.inputmethod(53);

  }
}
