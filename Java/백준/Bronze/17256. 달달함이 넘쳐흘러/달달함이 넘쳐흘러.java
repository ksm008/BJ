import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int ax =  Integer.parseInt(str[0]);
        int ay =  Integer.parseInt(str[1]);
        int az =  Integer.parseInt(str[2]);

        str = br.readLine().split(" ");
        int cx =  Integer.parseInt(str[0]);
        int cy =  Integer.parseInt(str[1]);
        int cz =  Integer.parseInt(str[2]);

        bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax));

        bw.flush();
        bw.close();
        br.close();
    }
}