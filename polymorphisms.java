/*
Run javac filename.java to compile the files
java filename to run the files
*/

class parent {
    protected String name = "Parent Name";
    // static method
    static void Staticmethod() {
    System.out.println("Static method from parent.");
    }
}

class oldchild extends parent {
    public int age = 23;
    // static method
    static void Staticmethodoldchild() {
    System.out.println("Static method from old child. ");
    }
}

class youngchild extends parent {
    public int age = 19;
    // static method
    static void Staticmethodyoungchild() {
    System.out.println("Static method from young child. ");
    }
}


public class Main {
    
    public static void main(String[] args) {
        oldchild myfirstchild = new oldchild();
        myfirstchild.Staticmethod();
        System.out.println(myfirstchild.name);
        System.out.println(myfirstchild.age);   
        myfirstchild.Staticmethodoldchild();
        
        youngchild mysecondchild = new youngchild();
        mysecondchild.Staticmethod();
        System.out.println(mysecondchild.name);
        System.out.println(mysecondchild.age);   
        mysecondchild.Staticmethodyoungchild();
        
    }
}