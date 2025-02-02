import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num >= 620 && num <= 780) {
            bw.write("Red");
        } else if (num >= 590 && num < 620) {
            bw.write("Orange");
        } else if (num >= 570 && num < 590) {
            bw.write("Yellow");
        } else if (num >= 495 && num < 570) {
            bw.write("Green");
        } else if (num >= 450 && num < 495) {
            bw.write("Blue");
        } else if (num >= 425 && num < 450) {
            bw.write("Indigo");
        } else if (num >= 380 && num < 425) {
            bw.write("Violet");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}