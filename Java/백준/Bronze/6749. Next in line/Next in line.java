import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int first = Integer.parseInt(br.readLine());
        int mid = Integer.parseInt(br.readLine());
        int diff = mid - first;

        bw.write(mid + diff + "");

        bw.flush();
        bw.close();
        br.close();
    }
}