import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str =br.readLine().split(" ");
        
        int row = Integer.parseInt(str[0]);
        int col = Integer.parseInt(str[1]);
        
        char[][] chess =  new char[row][col];
        
        for (int i = 0; i < row; i++) {
        	String str1 = br.readLine();
        	for (int j = 0; j < col;j++) {
        		chess[i][j] = str1.charAt(j);
        	}
        }
        
        int min = Integer.MAX_VALUE;

		for (int i = 0; i <= row - 8; i++) {
		    for (int j = 0; j <= col - 8; j++) {
		        int repaint = repairCount(chess, i, j);
		        min = Math.min(min, repaint);
		    }
		}
		
		bw.write(min + "");

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static int repairCount(char[][] board, int row, int col) {
    int wCount = 0, bCount = 0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            char current = board[row + i][col + j];
            boolean shouldBeWhite = (i + j) % 2 == 0;
            if (shouldBeWhite) {
                if (current != 'W') wCount++;
                if (current != 'B') bCount++;
            } else {
                if (current != 'B') wCount++;
                if (current != 'W') bCount++;
            }
        }
    }

    return Math.min(wCount, bCount);
}
}