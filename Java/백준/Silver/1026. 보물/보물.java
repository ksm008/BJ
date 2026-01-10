import java.io.*;  
import java.util.Arrays;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        int[] arrayA = new int[N];  
        int[] arrayB = new int[N];  
  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < N; i++) {  
            arrayA[i] = Integer.parseInt(st.nextToken());  
        }  
  
        st = new StringTokenizer(br.readLine());  
  
        for (int j = 0; j < N; j++) {  
            arrayB[j] = Integer.parseInt(st.nextToken());  
        }  
  
        Arrays.sort(arrayA);  
        Arrays.sort(arrayB);  
  
        int result = 0;  
  
        for (int i = 0; i < N; i++) {  
            result += arrayA[i] * arrayB[N - i - 1];  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}