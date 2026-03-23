import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int MAX = Integer.parseInt(str[0]);
        int repeatNum = Integer.parseInt(str[1]);

        int[] resultArray = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            resultArray[i] = i + 1;
        }

        for (int i = 0; i < repeatNum; i++) {
            String[] str2 = br.readLine().split(" ");
            int start = Integer.parseInt(str2[0]) - 1;
            int end = Integer.parseInt(str2[1]) - 1;

            while (start < end) {
                int temp = resultArray[start];
                resultArray[start] = resultArray[end];
                resultArray[end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < MAX; i++) {
            bw.write(resultArray[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}