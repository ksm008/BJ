import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        for (int i = 0; i < 4; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
            char result;  
  
            int firstX = Integer.parseInt(st.nextToken());  
            int firstY = Integer.parseInt(st.nextToken());  
            int firstP = Integer.parseInt(st.nextToken());  
            int firstQ = Integer.parseInt(st.nextToken());  
  
            int secondX = Integer.parseInt(st.nextToken());  
            int secondY = Integer.parseInt(st.nextToken());  
            int secondP = Integer.parseInt(st.nextToken());  
            int secondQ = Integer.parseInt(st.nextToken());  
  
            if (firstP < secondX || firstX > secondP || firstQ < secondY || firstY > secondQ) {  
                result = 'd';  
            } else if ((firstP == secondX && firstQ == secondY)  
                    || (secondP == firstX && secondQ == firstY)  
                    || (firstP == secondX && firstY == secondQ)  
                    || (firstX == secondP && firstQ == secondY)  
            ) {  
                result = 'c';  
            } else if (firstP == secondX  
                    || secondP == firstX  
                    || firstY == secondQ  
                    || secondY == firstQ) {  
                result = 'b';  
            } else result = 'a';  
            sb.append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}