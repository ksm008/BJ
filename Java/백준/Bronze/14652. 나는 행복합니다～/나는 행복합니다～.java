import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
        int col = Integer.parseInt(str[1]);  
        int num = Integer.parseInt(str[2]);  
  
        int idiotRow = num / col;  
        int idiotCol = num % col;  
  
        bw.write(idiotRow + " " + idiotCol);  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}