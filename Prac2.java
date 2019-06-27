import java.util.Scanner;
public class Prac2
{
    public static void main(String[] args) {
        int marks[]=new int[7];
        int  total=0;
        float percentage=0;
        Scanner scan =new Scanner(System.in);
        for(int i=1;i <=6;i++){
            marks[i]=scan.nextInt();
        }
        for (int i = 1; i <= 6; i++) {
            total = total + marks[i];  
        }
        percentage=(total*100)/600;
        System.out.println("Students percentage:" + percentage);
    }
}