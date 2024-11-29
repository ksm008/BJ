import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        ArrayList<Integer> intList = new ArrayList<>();

        for (String num : str) {
            intList.add(Integer.parseInt(num));
        }

        Collections.sort(intList);

        for (int num : intList) {
            bw.write(num + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}