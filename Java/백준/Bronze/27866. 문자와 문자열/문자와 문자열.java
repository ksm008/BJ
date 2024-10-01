import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] str2 = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            str2[i] = String.valueOf(str.charAt(i));
        }

        int num = Integer.parseInt(br.readLine());
        bw.write(str2[num-1]);
        bw.flush();
        bw.close();
        br.close();
    }
}