import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int yonseiRank = 0;  
        int koreaRank = 0;  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            if (str.equals("yonsei")) {  
                yonseiRank = i;  
            } else if (str.equals("korea")) {  
                koreaRank = i;  
            }  
        }  
  
        sb.append(yonseiRank < koreaRank ? "Yonsei Won!" : "Yonsei Lost...");  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}