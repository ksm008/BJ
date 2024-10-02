import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();

        int result1 = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        String result2 = Integer.toString(Integer.parseInt(A + B) - Integer.parseInt(C));


        bw.write(Integer.toString(result1)+"\n");
        bw.write(result2);

        bw.flush();
        bw.close();
        br.close();
    }
}