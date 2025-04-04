import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int quo = num / 5;
        int remain = num % 5;

        for (int i = 0; i < quo; i++)  bw.write("V");
        for (int i = 0; i < remain; i++) bw.write("I");

        bw.flush();
        bw.close();
        br.close();
    }
}