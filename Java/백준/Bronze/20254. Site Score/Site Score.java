import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 단순 계산...  
  
        String[] str = br.readLine().split(" ");  
        int uR = Integer.parseInt(str[0]);  
        int tR = Integer.parseInt(str[1]);  
        int uO = Integer.parseInt(str[2]);  
        int tO = Integer.parseInt(str[3]);  
  
        bw.write(56 * uR + 24 * tR + 14 * uO + 6 * tO + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}