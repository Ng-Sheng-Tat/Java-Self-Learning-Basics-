/*
Run javac filename.java to compile the files
java filename to run the files
*/

// class name must start with capital letter and be the same name as your file
public class Main {
  int x = 10;

  // use in class constructor
  int y;
  String name;

  // static method
  static void Staticmethod() {
    System.out.println("Static method can be called without creating an object. ");
  }

  // input parameter with public method
  public void inputmethod(int numbers) {
    System.out.println(numbers + " is an input parameter.");
  }

  // the constructor name must match the class name,
  // and it cannot have a return type (like void).
  public Main(int z, String val) {
    name = val;
    y = 15;
    System.out.println(name + " is initialized by " + z);

  }


  public static void main(String[] args) {
    // create an instance of the class
    Main myobject = new Main(123, "MYNAME");
    // System.out.println(myobject.x);
    // myobject.x = 50;
    // System.out.println(myobject.x);
    System.out.println(myobject.y);


    // compiled java folders in the same directory
    // Importme importobject = new Importme();
    // System.out.println(importobject.x);
    // importobject.inputmethodsecondclass(23);



  }
}
