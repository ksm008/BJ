import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
        int[] cases = new int[num];  
        int max = 0;  
  
        for (int i = 0; i < num; i++) {  
            cases[i] = Integer.parseInt(br.readLine());  
            if (cases[i] > max) {  
                max = cases[i];  
            }  
        }  
  
        int[] cnt0 = new int[max + 2];  
        int[] cnt1 = new int[max + 2];  
  
        cnt0[0] = 1; cnt1[0] = 0;  
        cnt0[1] = 0; cnt1[1] = 1;  
  
        for (int i = 2; i <= max; i++) {  
            cnt0[i] = cnt0[i - 1] + cnt0[i - 2];  
            cnt1[i] = cnt1[i - 1] + cnt1[i - 2];  
        }  
  
        StringBuilder sb = new StringBuilder();  
        for (int n : cases) {  
            sb.append(cnt0[n]).append(" ").append(cnt1[n]).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}