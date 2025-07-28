import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        Map<String, String> siteNPw= new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] str1 = br.readLine().split(" ");
            siteNPw.put(str1[0], str1[1]);
        }

        for (int i = 0; i < M; i++) {
            String result = siteNPw.get(br.readLine());
            bw.write( result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}