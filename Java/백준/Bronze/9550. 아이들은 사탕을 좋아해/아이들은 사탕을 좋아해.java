import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());  

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);  
            int k = Integer.parseInt(str[1]);  

            String[] candies = br.readLine().split(" ");
            int result = 0;

            for (int j = 0; j < n; j++) {
                int candy = Integer.parseInt(candies[j]);
                result += candy / k;  
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}