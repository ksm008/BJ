import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //...범위 내에서 NFA가 발생하는 일은 없다.
        
        String str = br.readLine();

        Set<String> numCnt = new HashSet<>();

        while (true) {
            if (numCnt.contains(str)) {
                bw.write("FA");
                break;
            }

            numCnt.add(str);

            int first = str.charAt(0) - '0';
            int len = str.length();

            int next = first * len;
            str = Integer.toString(next);
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
