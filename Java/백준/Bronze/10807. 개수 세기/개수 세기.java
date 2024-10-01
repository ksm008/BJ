import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i, j, count = 0;
        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];
        str = br.readLine().split(" ");

        int findNum = Integer.parseInt(br.readLine());
        for (j = 0; j < num; j++) {
            if (Integer.parseInt(str[j]) == findNum) {
                count += 1;
            }
        }
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}