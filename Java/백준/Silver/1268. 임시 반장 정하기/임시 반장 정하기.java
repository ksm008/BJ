import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int[][] students = new int[N][5];  
        int[] wasSameClass = new int[N + 1];  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < 5; j++) {  
                students[i][j] = Integer.parseInt(st.nextToken());  
            }  
        }  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {  
                if (i != j) {  
                    for (int k = 0; k < 5; k++) {  
                        if (students[i][k] == students[j][k]) {  
                            wasSameClass[i + 1]++;  
                            break;  
                        }  
                    }  
                }  
            }  
        }  
  
        int temp = Integer.MIN_VALUE;  
        int result = 0;  
        for (int i = 1; i < N + 1; i++) {  
            if (temp < wasSameClass[i]) {  
                temp = wasSameClass[i];  
                result = i;  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}