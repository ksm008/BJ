import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
        int S = Integer.parseInt(str[0]);   
        int T = Integer.parseInt(str[1]);   
        int D = Integer.parseInt(str[2]);   
  
        int time = D / (2 * S);   
        int F = T * time;         
  
        bw.write(F + "");  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}