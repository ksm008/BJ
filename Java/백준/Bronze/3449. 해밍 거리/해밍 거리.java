import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int temp = 0;
            String A = br.readLine();
            String B = br.readLine();

            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j)) {
                    temp++;
                }
            }

            bw.write("Hamming distance is " + temp + ".\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}