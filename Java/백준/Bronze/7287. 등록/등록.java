import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(107 + "\n");
        bw.write("ksm008");
        bw.flush();
        bw.close();
    }
}