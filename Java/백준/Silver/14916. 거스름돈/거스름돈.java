import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        int count = N / 5;  
        int remain = N % 5;  
  
        if (remain % 2 != 0) {  
            if (count == 0) sb.append("-1");  
            else {  
                count -= 1;  
                remain += 5;  
                count += remain / 2;  
                sb.append(count);  
            }  
        } else {  
            count += remain / 2;  
            sb.append(count);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}