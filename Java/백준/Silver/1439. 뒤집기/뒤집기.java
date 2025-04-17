import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int zero = 0;
        int one = 0;

        char previous = str.charAt(0);
        if (previous == '0') zero++;
        else one++;

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != previous) {
                if (current == '0') zero++;
                else one++;
                previous = current;
            }
        }

        bw.write(Math.min(zero, one) + "");
        
        bw.flush();
        bw.close();
        br.close();
    }
}