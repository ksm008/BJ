import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // int 범위를 넘어가기 때문에 적어도 long을 써야함...  
        // 출력은 삼항 연산자로 처리  
  
        String[] str = br.readLine().split(" ");  
  
        long a = Long.parseLong(str[0]);  
        long b = Long.parseLong(str[1]);  
  
        bw.write(a % b == 0 ? "Yes" : "No");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}