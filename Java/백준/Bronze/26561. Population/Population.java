import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int p = Integer.parseInt(str[0]);
            int t = Integer.parseInt(str[1]);
            
            int births = t / 4;
            int deaths = t / 7;
            int result = p + births - deaths;
            
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}