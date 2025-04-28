import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            if (str.length == 1) {
                if (str[0].equals("top")) {
                    if (stack.isEmpty()) bw.write("-1\n");
                    else bw.write(stack.get(stack.size() - 1) + "\n");
                } else if (str[0].equals("size")) bw.write(stack.size() + "\n");
                 else if (str[0].equals("empty")) {
                     if (stack.isEmpty()) bw.write("1\n");
                     else bw.write("0\n");
                } else if (str[0].equals("pop")) {
                    if (stack.isEmpty()) bw.write("-1\n");
                     else {
                        bw.write(stack.get(stack.size() - 1) + "\n");
                        stack.remove(stack.size() - 1);
                    }
                }
            }
            else if (str.length == 2) stack.add(Integer.parseInt(str[1]));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}