import java.io.*;

public class BufferedReaderInput {
    public static void main(String[] args) throws  IOException{
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Here is what you have written "+str);
    }
}
