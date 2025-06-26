import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = Integer.parseInt(br.readLine());  
        String killer = "";  
  
        for (int i = 0; i < num; i++) {  
            String str = br.readLine();  
            if (str.contains("S")) {  
                killer = str;  
            }  
        }  
  
        bw.write(killer + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}