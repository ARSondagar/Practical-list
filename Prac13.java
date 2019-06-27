import java.io.*;

public class Prac13
{

    public static void main(String args[]) throws IOException {

        DataInputStream dataIS = new DataInputStream(new FileInputStream("stdinfo.txt"));

        DataOutputStream dataOS = new DataOutputStream(new FileOutputStream("newstdinfo.txt"));
        // manipulate the student information from files
        String str;
        while ((str = dataIS.readLine()) != null) {
            String upper = str.toUpperCase();
            System.out.println(upper);
            dataOS.writeBytes(upper + "  ,");
        }
        dataIS.close();
        dataOS.close();
    }
}