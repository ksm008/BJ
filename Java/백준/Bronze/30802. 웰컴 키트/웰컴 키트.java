import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] tShirts = new int[6];

        for (int i = 0; i < 6; i++){
            tShirts[i] = Integer.parseInt(str[i]);
        }

        int tShirtsTotal = 0;
        String[] str2 = br.readLine().split(" ");
        int bundleT = Integer.parseInt(str2[0]);
        int bundleP = Integer.parseInt(str2[1]);

        for (int S : tShirts) {
            tShirtsTotal += (S + bundleT - 1) / bundleT;
        }

        int penMulti = num / bundleP;
        int penSingle = num % bundleP;

        bw.write(tShirtsTotal + "\n");
        bw.write(penMulti + " " + penSingle);

        bw.flush();
        bw.close();
        br.close();
    }
}