import java.util.ArrayList;

public class Main {
    
  
  public static void main(String[] args) {
      int count = 0;
      ArrayList<Integer> mylist1 = new ArrayList<Integer>();
      mylist1.add(10);
      mylist1.add(20);
      mylist1.add(20);
      mylist1.add(20);
      
      ArrayList<Integer> mylist2 = new ArrayList<Integer>();
      mylist2.add(10);
      mylist2.add(25);
      mylist2.add(30);
      mylist2.add(40);
      
    //   System.out.println(mylist1);
    //   System.out.println(mylist2);
    for (int i : mylist1) {
        for (int j : mylist2) {
          if (i + j > 50) {
              count += 1;
          }
        }
    }
    System.out.println(count);
  }
}