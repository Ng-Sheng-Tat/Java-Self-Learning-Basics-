/*
Run javac filename.java to compile the files
java filename to run the files
*/

class outer {
    protected String nameo = "Outer Name";
    // static method
    static void StaticOutermethod() {
    System.out.println("Static method from outer.");
    }
    class inner {
        protected String namei = "Inner Name";
        // static method
        static void StaticInnermethod() {
        System.out.println("Static method from inner.");
        
        }
        
    }
    
    // An inner class can also be static, which means that you can access it 
    // without creating an object of the outer class
    static class publicinner {
        protected String nameipub = "Inner Public Name";
        // static method
        static void StaticPublicInnermethod() {
        System.out.println("Static Public method from inner.");
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        outer.publicinner myInnerPub = new outer.publicinner();
        System.out.println(myInnerPub.nameipub);  
        myInnerPub.StaticPublicInnermethod();
        
        outer myOuter = new outer();
        outer.inner myInner = myOuter.new inner();
        System.out.println(myOuter.nameo);
        myOuter.StaticOutermethod();
        System.out.println(myInner.namei);
        myInner.StaticInnermethod();
        
        
    }
}