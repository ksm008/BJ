import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < num; i++) {
            int floor = Integer.parseInt(br.readLine()); 
            int roomNum = Integer.parseInt(br.readLine()); 

            int[][] building = new int[floor + 1][roomNum];

            for (int j = 0; j < roomNum; j++) {
                building[0][j] = j + 1; //
            }
            
            for (int k = 1; k <= floor; k++) {
                for (int n = 0; n < roomNum; n++) {
                    for (int m = 0; m <= n; m++) {
                        building[k][n] += building[k - 1][m];
                    }
                }
            }
            bw.write(building[floor][roomNum - 1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}