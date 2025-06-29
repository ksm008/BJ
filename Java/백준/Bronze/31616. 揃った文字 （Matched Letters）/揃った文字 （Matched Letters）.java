import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = Integer.parseInt(br.readLine());  
        String s = br.readLine();  
  
        char first = s.charAt(0);  
        boolean same = true;  
  
        for (int i = 1; i < num; i++) {  
            if (s.charAt(i) != first) {  
                same = false;  
                break;  
            }  
        }  
  
        bw.write(same ? "Yes" : "No");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}