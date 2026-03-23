import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 간단한 계산 문제.  
  
        int num = Integer.parseInt(br.readLine());  
        String[] str = br.readLine().split(" ");  
  
        if (Integer.parseInt(str[0]) / Integer.parseInt(str[1]) >= num) {  
            bw.write("1");  
        } else {  
            bw.write("0");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}