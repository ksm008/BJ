import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        int[][] land =  new int[N][M];  
  
        for (int i = 0; i < N; i++) {  
            st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < M; j++) {  
                land[i][j] = Integer.parseInt(st.nextToken());  
            }  
        }  
  
        int[] result = new int[2];  
        result[0] = Integer.MAX_VALUE; // 시간임  
        result[1] = Integer.MIN_VALUE; // 높이임  
  
        for (int h = 0; h <= 256; h++) {  
            int resultTime = 0;  
            int temp = B;  
  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < M; j++) {  
                    if (land[i][j] > h) {  
                        resultTime += 2 * (land[i][j] - h);  
                        temp += land[i][j] - h;  
                    } else if (land[i][j] < h) {  
                        resultTime += h - land[i][j];  
                        temp -= h - land[i][j];  
                    }  
                }  
            }  
            if (temp >= 0) {  
                if (resultTime <= result[0]) {  
                    result[0] = resultTime;  
                    result[1] = h;  
                }  
            }  
        }  
  
        sb.append(result[0] + " " + result[1]);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}