import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 가장 앞에 있는 문자를 읽어 비교하기  
  
        int num = Integer.parseInt(br.readLine());  
        int result = 0;  
  
        for (int i = 0; i < num; i++) {  
            String str = br.readLine();  
  
            if (str.charAt(0) == 'C') result++;  
        }  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}