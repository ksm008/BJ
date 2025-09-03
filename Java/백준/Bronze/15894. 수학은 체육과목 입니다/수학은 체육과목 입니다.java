import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        long num =  Long.parseLong(br.readLine());  
  
        bw.write(num * 4 + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}