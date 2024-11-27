import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int div = 20000303;
        int remain = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; 
            remain = (remain * 10 + digit) % div; 
        }

        bw.write(String.valueOf(remain)); 
        bw.flush();
        bw.close();
        br.close();
    }
}
