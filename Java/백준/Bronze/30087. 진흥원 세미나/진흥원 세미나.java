import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp = 0;
        while (true) {

            String str = br.readLine();

            if (str.equals("Algorithm")) {
                bw.write("204");
            } else if (str.equals("DataAnalysis")) {
                bw.write("207");
            } else if (str.equals("ArtificialIntelligence")) {
                bw.write("302");
            } else if (str.equals("CyberSecurity")) {
                bw.write("B101");
            } else if (str.equals("Network")) {
                bw.write("303");
            } else if (str.equals("Startup")) {
                bw.write("501");
            } else if (str.equals("TestStrategy")) {
                bw.write("105");
            }

            temp++;
            if (temp == num) {
                break;
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}