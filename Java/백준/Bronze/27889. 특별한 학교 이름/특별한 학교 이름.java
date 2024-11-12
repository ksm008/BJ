import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String school = br.readLine();

        if (school.equals("NLCS")) {
            bw.write("North London Collegiate School");
        } else if (school.equals("BHA")) {
            bw.write("Branksome Hall Asia");
        } else if (school.equals("KIS")){
            bw.write("Korea International School");
        } else {
            bw.write("St. Johnsbury Academy");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}