import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        while (true) {  
            String str = br.readLine();  
  
            String result = new StringBuilder(str).reverse().toString();  
              
            if (str.equals("END")) {  
                break;  
            }  
              
            bw.write(result + "\n");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}