import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i;
        int num = Integer.parseInt(br.readLine());

        for (i = 1;i < 10;i++) {
            System.out.println(num + " * " + i + " = " + i * num);
        }
    }
}