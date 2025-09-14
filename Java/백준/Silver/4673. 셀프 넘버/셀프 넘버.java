import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        boolean[] gen = new boolean[10001];  
  
        for (int i = 1; i <= 10000; i++) {  
            int num = i, s = i;  
            while (num > 0) {  
                s += num % 10;  
                num /= 10;  
            }  
            if (s <= 10000) gen[s] = true;  
        }  
  
        for (int i = 1; i <= 10000; i++) {  
            if (!gen[i]) sb.append(i).append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}