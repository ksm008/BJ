import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()) - 1;
        int year = 2024;
        int month = 8;
        int resultYear = year + ((month + (num * 7)) - 1) / 12;
        int resultMonth = (month + (num * 7)) % 12;
        if (resultMonth == 0) {
            resultMonth = 12;
        }

        bw.write(resultYear + " " + resultMonth);

        bw.flush();
        bw.close();
        br.close();
    }
}