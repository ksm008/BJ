import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;
        int num = Integer.parseInt(br.readLine());
        int[] numArray = new int[num];

        String numString = br.readLine();

        for (int i = 0; i < num; i++) {
            numArray[i] = Character.getNumericValue(numString.charAt(i));
            result += numArray[i];
        }

        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}