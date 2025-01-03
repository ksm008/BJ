import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            int space = 2;

            if (str.equals("0")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '1') {
                    space += 2;
                } else if (str.charAt(i) == '0') {
                    space += 4;
                } else {
                    space += 3;
                }

                if (i < str.length() - 1) {
                    space += 1;
                }
            }

            bw.write(space + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}