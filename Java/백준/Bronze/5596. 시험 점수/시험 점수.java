import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");

        int minguk = 0, manse = 0;

        for (String str : str1) {
            minguk += Integer.parseInt(str);
        }

        for (String str : str2) {
            manse += Integer.parseInt(str);
        }

        if (minguk >= manse) {
            bw.write(Integer.toString(minguk));
        } else {
            bw.write(Integer.toString(manse));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}