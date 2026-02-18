import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cA = Integer.parseInt(st.nextToken());
        int bA = Integer.parseInt(st.nextToken());
        int pA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int cR = Integer.parseInt(st.nextToken());
        int bR = Integer.parseInt(st.nextToken());
        int pR = Integer.parseInt(st.nextToken());

        int result = 0;

        if (cR > cA) result += cR - cA;
        if (bR > bA) result += bR - bA;
        if (pR > pA) result += pR - pA;
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}