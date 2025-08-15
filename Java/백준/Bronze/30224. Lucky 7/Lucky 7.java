import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String str = br.readLine();  
        int num = Integer.parseInt(str);  
  
        if (str.contains("7") && num % 7 == 0) {  
            bw.write("3");  
        } else if (str.contains("7")) {  
            bw.write("2");  
        } else if (num % 7 == 0) {  
            bw.write("1");  
        } else {  
            bw.write("0");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}