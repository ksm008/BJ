import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        String result;  
  
        if (N % 10 != 0) {  
            result = "-1";  
        } else {  
            int A = N / 300;  
            N %= 300;  
            int B = N / 60;  
            N %= 60;  
            int C = N / 10;  
  
            result = A + " " + B + " " + C;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}