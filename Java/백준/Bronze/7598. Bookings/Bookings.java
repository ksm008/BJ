import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] str = br.readLine().split(" ");
            if (str[0].equals("#")) break;

            int bookedSeats = Integer.parseInt(str[1]);

            while (true) {
                String[] booking = br.readLine().split(" ");
                String bookAlpha = booking[0];
                int seats = Integer.parseInt(booking[1]);
                if (bookAlpha.equals("X")) {
                    bw.write(str[0] + " " + bookedSeats + "\n");
                    break;
                }

                if (bookAlpha.equals("B")) {
                    if (bookedSeats + seats <= 68) bookedSeats += seats;
                }

                if (bookAlpha.equals("C")) {
                    if (bookedSeats - seats >= 0) bookedSeats -= seats;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}