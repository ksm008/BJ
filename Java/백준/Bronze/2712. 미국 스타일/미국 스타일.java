import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");

            BigDecimal weight = new BigDecimal(str[0]);
            String measure = str[1];

            switch (measure) {
                case "kg":
                    weight = weight.multiply(new BigDecimal("2.2046"));
                    measure = "lb";
                    break;
                case "lb":
                    weight = weight.multiply(new BigDecimal("0.4536"));
                    measure = "kg";
                    break;
                case "l":
                    weight = weight.multiply(new BigDecimal("0.2642"));
                    measure = "g";
                    break;
                case "g":
                    weight = weight.multiply(new BigDecimal("3.7854"));
                    measure = "l";
                    break;
            }

            weight = weight.setScale(4, RoundingMode.HALF_UP); 
            bw.write(weight.toPlainString() + " " + measure + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}