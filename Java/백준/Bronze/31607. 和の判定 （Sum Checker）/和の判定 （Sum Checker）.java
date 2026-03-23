import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 조건문 3개 중 하나라도 참이면 1 출력하기  
  
        int a = Integer.parseInt(br.readLine());  
        int b = Integer.parseInt(br.readLine());  
        int c = Integer.parseInt(br.readLine());  
  
        if (a == b + c || b == a + c || c == a + b) {  
            bw.write("1");  
        } else {  
            bw.write("0");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}