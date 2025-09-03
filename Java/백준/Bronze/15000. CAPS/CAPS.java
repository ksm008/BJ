import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 자바는 문자열을 대문자로 바꿔주는 toUpperCase()메소드가 있다.  
        String str = br.readLine().toUpperCase();  
        bw.write(str + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}