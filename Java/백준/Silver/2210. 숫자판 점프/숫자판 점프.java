import java.io.*;  
import java.util.HashSet;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static HashSet<String> resultSet = new HashSet<String>();;  
  
    public static void main(String[] args) throws IOException {  
        int[][] board = new int[5][5];  
  
        for (int i = 0; i < 5; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < 5; j++) {  
                board[i][j] = Integer.parseInt(st.nextToken());  
            }  
        }  
  
        for (int i = 0; i < 5; i++) {  
            for (int j = 0; j < 5; j++) {  
                dfs(board, "", i, j);  
            }  
        }  
  
        sb.append(resultSet.size());  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void dfs(int[][] board, String numString, int x, int y) {  
        if (numString.length() == 6) {  
            resultSet.add(numString);  
            return;  
        }  
  
        if (x < 0 || x >= 5 || y < 0 || y >= 5) {  
            return;  
        }  
  
        dfs(board, numString + board[x][y], x + 1, y);  
        dfs(board, numString + board[x][y], x - 1, y);  
        dfs(board, numString + board[x][y], x, y + 1);  
        dfs(board, numString + board[x][y], x, y - 1);  
    }  
}