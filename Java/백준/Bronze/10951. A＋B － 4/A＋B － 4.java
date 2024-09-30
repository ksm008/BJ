import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        StringBuilder sb=new StringBuilder();


        while (true) {
            String str = br.readLine();
            if (str == null || str.equals("")) {
                break;
            }
            st = new StringTokenizer(str);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = A + B;
            bw.write(C+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}