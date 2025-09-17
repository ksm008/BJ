import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        String first = br.readLine();  
        char[] pattern = first.toCharArray();  
  
        for (int i = 1; i < N; i++) {  
            String s = br.readLine();  
            for (int j = 0; j < pattern.length; j++) {  
                if (pattern[j] != s.charAt(j)) pattern[j] = '?';  
            }  
        }  
  
        sb.append(new String(pattern));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}