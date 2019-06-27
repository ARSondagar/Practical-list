import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Prac12
{

    public static void main(String[] argv) throws Exception {
        BufferedReader bufRead = new BufferedReader(new FileReader("stdinfo.txt"));
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("newstdinfo.txt"));
        int i;
        // manipulate the student information from files
        do {
            i = bufRead.read();
            if (i != -1) {
                if (Character.isUpperCase((char) i)) {
                    bufWrite.write(Character.toLowerCase((char) i));
                } else {
                    bufWrite.write((char) i);
                }
            }
        } while (i != -1);
        bufRead.close();
        bufWrite.close();
    }
} 