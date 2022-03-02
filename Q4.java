
public class Main {
  
  public static void main(String[] args) {
    int count = 0;
    String mysentence = "UCSI University is a comprehensive university in Kuala Lumpur, Malaysia";
    mysentence  = mysentence.toLowerCase();
    for (int i = 0; i < mysentence.length(); i++) {
        char temp = mysentence.charAt(i);
        if(temp == 'a'|| temp == 'e'|| temp == 'i' || temp == 'o' || temp == 'u') {
            count += 1;
         }
    }
    System.out.println(count);
  }
}