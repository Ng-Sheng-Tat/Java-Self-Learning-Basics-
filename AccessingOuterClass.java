/*
Run javac filename.java to compile the files
java filename to run the files
*/

class outer {
    String nameo = "Outer Name";
    class inner {
        public String myInnerMethod() {
            return nameo;
        }
    }
        
}

public class Main {
    
    public static void main(String[] args) {
        outer myOuter = new outer();
        outer.inner myInner = myOuter.new inner();
        System.out.println(myInner.myInnerMethod());
        
        
    }
}