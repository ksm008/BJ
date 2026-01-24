import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] person = new long[5]; 

        for (int i = 1; i <= 4; i++) {
            person[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken()); 
        long R = Long.parseLong(st.nextToken()); 

        int collision = 0;
        for (int i = 1; i <= 4; i++) {
            if (person[i] == X) {
                collision = i;
            }
        }

        sb.append(collision);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}