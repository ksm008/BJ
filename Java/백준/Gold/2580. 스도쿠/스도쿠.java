import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[][] sudoku;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st;  
        sudoku = new int[9][9];  
  
        for (int i = 0; i < 9; i++) {  
            st = new StringTokenizer(br.readLine());  
            for (int j = 0; j < 9; j++) {  
                sudoku[i][j] = Integer.parseInt(st.nextToken());  
            }  
        }  
  
        checkSudoku(0, 0);  
  
        for (int i = 0; i < 9; i++) {  
            for (int j = 0; j < 9; j++) {  
                if (j < 8) {  
                    sb.append(sudoku[i][j]).append(" ");  
                } else {  
                    sb.append(sudoku[i][j]);  
                }  
            }  
            sb.append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static boolean checkSudoku(int r, int c) {  
        if (r == 9) {  
            return true;  
        }  
        if (c == 9) {  
            return checkSudoku(r + 1, 0);  
        }  
  
        if (sudoku[r][c] == 0) {  
            for (int i = 1; i <= 9; i++) {  
                if (validate(r, c, i)) {  
                    sudoku[r][c] = i;  
                    if (checkSudoku(r, c + 1)) return true;  
                    else {  
                        sudoku[r][c] = 0;  
                    }  
                }  
            }  
        } else {  
            return checkSudoku(r, c + 1);  
        }  
        return false;  
    }  
  
    static boolean validate(int r, int c, int number) {  
        for (int i = 0; i < 9; i++) {  
            if (sudoku[i][c] == number) {  
                return false;  
            }  
            if (sudoku[r][i] ==  number) {  
                return false;  
            }  
        }  
  
        int boxR = r / 3;  
        int boxC = c / 3;  
  
        for (int i = 3 * boxR; i < 3 * boxR + 3; i++) {  
            for (int j = 3 * boxC; j < 3 * boxC + 3; j++) {  
                if (sudoku[i][j] == number) {  
                    return false;  
                }  
            }  
        }  
  
        return true;  
    }  
}