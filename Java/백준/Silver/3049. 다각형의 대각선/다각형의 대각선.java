import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = Integer.parseInt(br.readLine());  
  
        if (num < 4) bw.write("0");  
        else {  
            long result = (long) num * (num - 1) * (num - 2) * (num - 3) / 24;  
            bw.write(result + "");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}