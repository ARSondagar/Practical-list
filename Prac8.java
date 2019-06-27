import java.util.Scanner;
public class Prac8
 {

    public static void main(String[] args) {

        System.out.println("Enter the word 'quit' to end this program.");
        String str;
        int x = 0, A = 0, E = 0, I = 0, O = 0, U = 0;
        char ch;
        Scanner in = new Scanner(System.in);
        while (x < 1) {
            str = in.next();
            if (str.equals("quit")) {
                x++;
                in.close();
                break;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    ch = str.charAt(i);

                    if (ch == 'a' || ch == 'A') {
                        A++;
                    } else if (ch == 'e' || ch == 'E') {
                        E++;
                    } else if (ch == 'i' || ch == 'I') {
                        I++;
                    } else if (ch == 'o' || ch == 'O') {
                        O++;
                    } else if (ch == 'u' || ch == 'U') {
                        U++;
                    }
                }
            }
        }
        System.out.println("Vowels A or a: " + A + "\nVowels E or e: " + E + "\nVowels I or i: " + I);
        System.out.println("Vowels O or o: " + O + "\nVowels U or u: " + U + "\nTotal Vowels: " + (A + E + I + O + U));
    }
}