import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        char[] charArray = new char[N];  
  
        for (int i = 0; i < N; i++) {  
            charArray[i] = br.readLine().charAt(0);  
        }  
  
        int cnt = 0;  
  
        for (int i = 0; i < N; i++) {  
            char cur = br.readLine().charAt(0);  
            if (charArray[i] == cur) cnt++;  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}