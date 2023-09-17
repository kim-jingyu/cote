package theory.io;

import java.io.*;

public class BufferedReaderIO {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/my.txt")));
        String line = null;

        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();
    }
}
