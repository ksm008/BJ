import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < N; i++) {  
            String[] str = br.readLine().split(" ");  
            String first = str[0] + " " + str[1];  
            for (int j = 2; j < str.length; j++) {  
                sb.append(str[j]).append(" ");  
            }  
            sb.append(first + '\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}