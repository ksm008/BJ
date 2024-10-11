import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i = 0; i < 8; i++) {
            str = str.replace(croatia[i], "P");
        }
        int len = str.length();
        bw.write(Integer.toString(len));
        bw.flush();
        bw.close();
        br.close();
    }
}