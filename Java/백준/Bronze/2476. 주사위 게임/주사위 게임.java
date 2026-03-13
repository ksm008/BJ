import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        int totalMax = 0;  
        for (int i = 0; i < N; i++) {  
            int[] dice = new int[7];  
            int diceMax = 0;  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            for (int j = 0; j < 3; j++) {  
                int num = Integer.parseInt(st.nextToken());  
                dice[num]++;  
            }  
  
            for (int j = 1; j < 7; j++) {  
                if (dice[j] == 1) {  
                    diceMax = Math.max(diceMax, j * 100);  
                } else if (dice[j] == 2) {  
                    diceMax = Math.max(diceMax, 1000 + j * 100);  
                } else if (dice[j] == 3) {  
                    diceMax = Math.max(diceMax, 10000 + j * 1000);  
                    break;  
                }  
            }  
            totalMax = Math.max(totalMax, diceMax);  
        }  
  
        sb.append(totalMax);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}