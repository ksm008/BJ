import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.equals("Poblano")) {
                result += 1500;
            } else if (str.equals("Mirasol")) {
                result += 6000;
            } else if (str.equals("Serrano")) {
                result += 15500;
            } else if (str.equals("Cayenne")) {
                result += 40000;
            } else if (str.equals("Thai")) {
                result += 75000;
            } else if (str.equals("Habanero")) {
                result += 125000;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}