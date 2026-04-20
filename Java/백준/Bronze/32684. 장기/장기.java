import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        double cho = 0;  
        double han = 0;  
  
        for (int i = 0; i < 2; i++) {  
            st = new StringTokenizer(br.readLine());  
  
            int cha =  Integer.parseInt(st.nextToken());  
            int po =  Integer.parseInt(st.nextToken());  
            int ma =   Integer.parseInt(st.nextToken());  
            int sang = Integer.parseInt(st.nextToken());  
            int sa =  Integer.parseInt(st.nextToken());  
            int byeong =  Integer.parseInt(st.nextToken());  
  
            if (i == 0) {  
                cho = cha * 13 + po * 7 + ma * 5 + sang * 3 + sa * 3 + byeong * 2;  
            } else {  
                han = cha * 13 +  po * 7 + ma * 5 + sang * 3 + sa * 3 + byeong * 2 + 1.5;  
            }  
        }  
  
        if (cho > han) {  
            sb.append("cocjr0208");  
        } else {  
            sb.append("ekwoo");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}