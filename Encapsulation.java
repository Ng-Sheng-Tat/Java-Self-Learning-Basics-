/*
Run javac filename.java to compile the files
java filename to run the files
*/

// class name must start with capital letter and be the same name as your file
public class Encapsulation {
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
  // private to restrict access
  // as the name variable is declared as private,
  // we cannot access it from outside this class
  private int StudentSurName;
  
  // get method to retrive private variable
  public int getname() {
    return StudentSurName;
  }
  
  // Set method to rewrite ID
  public void setname(int newSurName) {
    //  The this keyword is used to refer to the current object
    this.StudentSurName = newSurName;
  }


  public static void main(String[] args) {
    // create an instance of the class
    Main myobject = new Main(123, "MYNAME");
    // System.out.println(myobject.x);
    // myobject.x = 50;
    // System.out.println(myobject.x);
    // System.out.println(myobject.y);
    myobject.setname(123);
    System.out.println(myobject.getname());
    myobject.setname(321);
    System.out.println(myobject.getname());

    // compiled java folders in the same directory
    // Importme importobject = new Importme();
    // System.out.println(importobject.x);
    // importobject.inputmethodsecondclass(23);



  }
}
