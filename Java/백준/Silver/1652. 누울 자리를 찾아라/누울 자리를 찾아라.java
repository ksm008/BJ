import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        char[][] room = new char[N][N];  
  
        int rowCnt = 0;  
        int colCnt = 0;  
  
        boolean isLinear = false;  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            for (int j = 0; j < N; j++) {  
                room[i][j] = str.charAt(j);  
            }  
        }  
  
        for (int i = 0; i < N; i++) {  
            isLinear = false;  
            for (int j = 0; j < N - 1; j++) {  
                char ch = room[i][j];  
                char next = room[i][j + 1];  
  
                if (ch == 'X') {  
                    isLinear = false;  
                }  
  
                if (ch == '.' && ch == next && !isLinear) {  
                    isLinear = true;  
                    rowCnt++;  
                }  
            }  
        }  
  
        for (int i = 0; i < N; i++) {  
            isLinear = false;  
            for (int j = 0; j < N - 1; j++) {  
                char ch = room[j][i];  
                char next = room[j + 1][i];  
  
                if (ch == 'X') {  
                    isLinear = false;  
                }  
  
                if (ch == '.' && ch == next && !isLinear) {  
                    isLinear = true;  
                    colCnt++;  
                }  
            }  
        }  
  
        sb.append(rowCnt).append(" ").append(colCnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}