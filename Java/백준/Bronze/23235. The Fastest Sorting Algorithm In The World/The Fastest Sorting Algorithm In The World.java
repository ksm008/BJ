import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = 1;  
  
        while (true) {  
            String str = br.readLine();  
  
            if (str.equals("0")) {  
                break;  
            }  
  
            bw.write("Case " + num + ": Sorting... done!\n");  
            num++;  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}