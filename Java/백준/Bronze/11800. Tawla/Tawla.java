import java.io.*;  
import java.util.HashMap;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        HashMap<Integer, String> map = new HashMap<>();  
  
        map.put(1, "Yakk");  
        map.put(2, "Doh");  
        map.put(3, "Seh");  
        map.put(4, "Ghar");  
        map.put(5, "Bang");  
        map.put(6, "Sheesh");  
  
        for (int i = 1; i <= N; i++) {  
            sb.append("Case ").append(i).append(": ");  
            st = new StringTokenizer(br.readLine());  
            int a = Integer.parseInt(st.nextToken());  
            int b = Integer.parseInt(st.nextToken());  
  
            if (a == b) {  
                switch (a) {  
                    case 1:  
                        sb.append("Habb Yakk");  
                        break;  
                    case 2:  
                        sb.append("Dobara");  
                        break;  
                    case 3:  
                        sb.append("Dousa");  
                        break;  
                    case 4:  
                        sb.append("Dorgy");  
                        break;  
                    case 5:  
                        sb.append("Dabash");  
                        break;  
                    case 6:  
                        sb.append("Dosh");  
                        break;  
                }  
            } else if ((a == 5 && b == 6) || (a == 6 && b == 5)) {  
                sb.append("Sheesh Beesh");  
            } else {  
                sb.append(map.get(Math.max(a, b))).append(" ").append(map.get(Math.min(a, b)));  
            }  
            sb.append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}