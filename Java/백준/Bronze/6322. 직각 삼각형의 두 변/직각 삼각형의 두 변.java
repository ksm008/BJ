import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int idx = 1;  
        while (true) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            double a = Double.parseDouble(st.nextToken());  
            double b = Double.parseDouble(st.nextToken());  
            double c = Double.parseDouble(st.nextToken());  
  
            if (a == 0 && b == 0 && c == 0) break;  
  
            sb.append("Triangle #").append(idx).append("\n");  
            if (a == -1) {  
                if (c <= b) {  
                    sb.append("Impossible.\n");  
                } else {  
                    double aCalc = Math.sqrt(c * c - b * b);  
                    sb.append("a = ").append(String.format("%.3f", aCalc)).append("\n");  
                }  
            } else if (b == -1) {  
                if (c <= a) {  
                    sb.append("Impossible.\n");  
                } else {  
                    double bCalc = Math.sqrt(c * c - a * a);  
                    sb.append("b = ").append(String.format("%.3f", bCalc)).append("\n");  
                }  
            } else {  
                double cCalc = Math.sqrt(a * a + b * b);  
                sb.append("c = ").append(String.format("%.3f", cCalc)).append("\n");  
            }  
  
            sb.append("\n");  
            idx++;  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}