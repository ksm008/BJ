import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // (a+1)(b+1) = ab + a + b + 1, 즉 (ab + a + b + 1) - ab - a - b = 1만 나오게 된다  
  
        int num  = Integer.parseInt(br.readLine());  
        bw.write("1");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}