import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //최소는 전부 5일때, 최대는 전부 6일때만 나오므로 replace를 사용하여 최솟값, 최댓값을 구하면 끝

        String[] str = br.readLine().split(" ");

        int max = Integer.parseInt(str[0].replace('5', '6')) + Integer.parseInt(str[1].replace('5', '6'));
        int min = Integer.parseInt(str[0].replace('6', '5')) + Integer.parseInt(str[1].replace('6','5'));

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}
