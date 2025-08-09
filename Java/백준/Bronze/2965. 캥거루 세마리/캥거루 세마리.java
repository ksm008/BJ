import java.io.*;  

import java.util.Arrays;  

  

public class Main {  

    public static void main(String[] args) throws IOException {  

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));  

        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));  

  

        String[] str = br.readLine().split(" ");  

        int[] pos = new int[3];  

  

        for (int i = 0; i < 3; i++) {  

            pos[i] = Integer.parseInt(str[i]);  

        }  

  

        Arrays.sort(pos);  

  

        int leftGap = pos[1] - pos[0];  

        int rightGap = pos[2] - pos[1];  

  

        int maxMoves = Math.max(leftGap, rightGap) - 1;  

  

        bw.write(maxMoves + "");  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}