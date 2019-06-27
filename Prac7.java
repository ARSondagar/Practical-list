import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        String rvs = new StringBuffer(str).reverse().toString();
        
        if(str.equals(rvs)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
    
}
  