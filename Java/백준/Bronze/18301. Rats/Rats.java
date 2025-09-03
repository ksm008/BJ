import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 단순 수식 계산...  
  
        String[] str = br.readLine().split(" ");  
        int n1 = Integer.parseInt(str[0]);  
        int n2 = Integer.parseInt(str[1]);  
        int n12 = Integer.parseInt(str[2]);  
        int result = ((n1 + 1) * (n2 + 1)) / (n12 + 1) - 1;  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}