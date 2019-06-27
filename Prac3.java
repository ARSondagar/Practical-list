import java.util.Scanner;
public class Prac3
{
    public static void main(String[] args) {
        int  first,second,add,sub,mul;
        double div;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number");
        first=scanner.nextInt();
        second=scanner.nextInt();
        add= first + second;
        sub= first- second;
        mul= first  * second;
        div=  (float) first/second;
        System.out.println("sum=" + add);
        System.out.println("difference=" + div);
        System.out.println("multiplication" + mul);
        System.out.println("division" + div);
    }
}