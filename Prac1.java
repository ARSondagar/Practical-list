 package pl;
 import java.util.Scanner;
 public class Prac1
 {
public static void main(String[] args)
 {
    float rupee;
    Scanner in=new Scanner(System.in);
    System.out.println("please enter courancy in rupees:");
    rupee=in.nextLong();
    float dollars=rupee /64;
    System.out.println(dollars + "Dollars");
}
}