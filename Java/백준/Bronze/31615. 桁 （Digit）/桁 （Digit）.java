import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // int는 length를 직접 구할 수 없기 때문에 String 메소드를 사용함

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        int result = n1 + n2;

        bw.write(String.valueOf(result).length() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}