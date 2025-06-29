import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 전부 더하고 가장 작은 값을 빼도 되잖아?  
        String[] str = br.readLine().split(" ");  
  
        int A = Integer.parseInt(str[0]);  
        int B = Integer.parseInt(str[1]);  
        int C = Integer.parseInt(str[2]);  
  
        int total = A + B + C;  
        int min = Math.min(A, Math.min(B, C));  
  
        int result = total - min;  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}