import java.util.Scanner;
public  class Prac4
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println("Length of string=" +  str.length());
        System.out.println("print second half=" + str.substring(str.length()/2));
    }
}