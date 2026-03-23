import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // - 문자로 문자열을 구분시키고 배열 크기만큼 가장 첫 문자를 반복출력  
  
        String[] str = br.readLine().split("-");  
  
        for (int i = 0; i < str.length; i++) {  
            bw.write(str[i].charAt(0));  
        }  
        
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}