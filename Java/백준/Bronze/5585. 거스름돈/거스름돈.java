import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int[] change = {500,100,50,10,5,1};  
        int N = 1000 - Integer.parseInt(br.readLine());  
        int result = 0;  
  
        for (int i = 0; i < 6; i++) {  
            if (N >= change[i]) {  
                result += N / change[i];  
                N %= change[i];  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}