import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numList = new ArrayList<>();
        List<Integer> numListSorted = new ArrayList<>();

        for (int i = 0;i < 9;i++) {
            numList.add(Integer.parseInt(br.readLine()));
            numListSorted.add(numList.get(i));
        }

        Collections.sort(numListSorted);
        int index = numList.indexOf(numListSorted.get(8));

        bw.write(Integer.toString(numListSorted.get(8))+"\n");
        bw.write(Integer.toString(index + 1));

        bw.flush();
        bw.close();
        br.close();
    }
}