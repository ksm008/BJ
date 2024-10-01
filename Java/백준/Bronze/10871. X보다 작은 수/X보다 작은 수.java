import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String[] NumArray = br.readLine().split(" ");

        for (int i = 0; i < Integer.parseInt(str[0]); i++) {
            if (Integer.parseInt(NumArray[i]) < Integer.parseInt(str[1])) {
                bw.write(NumArray[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}