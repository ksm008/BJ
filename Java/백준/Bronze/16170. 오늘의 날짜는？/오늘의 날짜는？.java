import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("2025\n");
        bw.write("01\n");
        bw.write("21");

        bw.flush();
        bw.close();
    }
}