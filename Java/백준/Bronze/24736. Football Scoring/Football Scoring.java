import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 간단한 계산 문제...  
        int[] result = new int[2];  
        for (int i = 0; i < 2; i++) {  
            String[] str = br.readLine().split(" ");  
            int T = Integer.parseInt(str[0]) * 6;  
            int F = Integer.parseInt(str[1]) * 3;  
            int S = Integer.parseInt(str[2]) * 2;  
            int P = Integer.parseInt(str[3]);  
            int C = Integer.parseInt(str[4]) * 2;  
            result[i] = T + F + S + P + C;  
        }  
          
        bw.write(result[0] + " " + result[1]);  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}