import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 7로 나눈 나머지로 확인하기  
  
        int num = Integer.parseInt(br.readLine());  
          
        if (num % 7 == 2) {  
            bw.write("1");  
        } else {  
            bw.write("0");  
        }  
          
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}