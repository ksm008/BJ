import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        switch (num) {
            case 1: bw.write("12 1600");
                break;
            case 2: bw.write("11 894");
                break;
            case 3: bw.write("11 1327");
                break;
            case 4: bw.write("10 1311");
                break;
            case 5: bw.write("9 1004");
                break;
            case 6: bw.write("9 1178");
                break;
            case 7: bw.write("9 1357");
                break;
            case 8: bw.write("8 837");
                break;
            case 9: bw.write("7 1055");
                break;
            case 10: bw.write("6 556");
                break;
            case 11: bw.write("6 773");
                break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}