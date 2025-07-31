import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 마이너스가 나온다면 그냥 뒤에 있는 숫자들은 전부 더해서 빼버리면 된다.
        
        String str = br.readLine();
        String[] minusParsed = str.split("-");

        int result = sum(minusParsed[0]); 

        for (int i = 1; i < minusParsed.length; i++) {
            result -= sum(minusParsed[i]); 
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int sum(String s) {
        String[] plusSplit = s.split("\\+");
        int total = 0;

        for (String num : plusSplit) {
            total += Integer.parseInt(num);
        }

        return total;
    }
}
