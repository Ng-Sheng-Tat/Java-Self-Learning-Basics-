/*
Run javac filename.java to compile the files
java filename to run the files
*/

public class FlowControl {
  // This is a method
  public static void main(String[] args) {

    int myint = 10, myint2 = 10;
    float myfloat = 10.6f;
    double mydouble = 1926.99d, mydouble2 = 12e2d;
    char mychar = 'A';
    boolean mybool = true;
    String mystring = "This is a string";
    mystring = "This is a string ";
    // final keyword declare it is a constant
    final int constantvariable = 5;

    // if-else-else if statement
    // if (myint < myint2) {
    //   System.out.println("myint2 is greater than myint1");
    // } else if (myint > myint2) {
    //   System.out.println("myint2 is smaller than myint1");
    // } else {
    //   System.out.println("myint2 is equal to myint1");
    // }

    //short-hand else if
    // String result = (myint < myint2) ? "myint2 is greater than myint1" : "myint2 is smaller than or equal to myint1";
    // System.out.println(result);

    // Switch-case
    // int day = 8;
    // switch (day) {
    //   case 1:
    //     System.out.println("Monday");
    //     break;
    //   case 2:
    //     System.out.println("Tuesday");
    //     break;
    //   case 3:
    //     System.out.println("Wednesday");
    //     break;
    //   case 4:
    //     System.out.println("Thursday");
    //     break;
    //   case 5:
    //     System.out.println("Friday");
    //     break;
    //   case 6:
    //     System.out.println("Saturday");
    //     break;
    //   case 7:
    //     System.out.println("Sunday");
    //     break;
    //   default:
    //     System.out.println("No such week day");
    // }
    // When Java reaches a break keyword, it breaks out of the switch block.

    // while loops
    // int i = 0;
    // while (i < 5) {
    //   if (i == 2) {
    //     break;
    //   }
    //   System.out.println(i);
    //   i++;
    // }
    //
    // System.out.println("");

    // do-while loops
    // i = 0;
    // do {
    //   if (i == 3) {
    //     break;
    //   }
    //   System.out.println(i);
    //   i++;
    // }
    // while (i < 5);
    //
    // System.out.println("");

    // For loops
    // for (i = 0; i < 5; i++) {
    //   if (i == 2) {
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    // For-Each Loops
    // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    // for (String j : cars) {
    //   if (j == "BMW") {
    //     break;
    //   }
    //   System.out.println(j);
    // }


    // Arrays
    // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    // System.out.println(cars[0]);
    // cars[0] = "Toyota";
    // // System.out.println(cars);
    // System.out.println(cars.length);
    // for (int i = 0; i < cars.length; i++) {
    //   System.out.println(cars[i]);
    // }
    //
    // int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    // int x = myNumbers[0][2];
    // System.out.println(x);
  }
}
