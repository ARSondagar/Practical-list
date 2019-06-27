import java.util.Scanner;

public class Prac6 {

    public static void main(String[] args) {

        int count = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("No of Capital Letters:" + count);
    }
}