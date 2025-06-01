import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int length = str.length();
        int colon = 0;
        int under = 0;

        for (char c : str.toCharArray()) {
            if (c == ':') colon++;
            else if (c == '_') under++;
        }

        int result = length + colon + under * 5;
        
        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}