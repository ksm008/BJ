import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        switch (str) {
            case "fdsajkl;":
            case "jkl;fdsa":
                sb.append("in-out");
                break;
            case "asdf;lkj":
            case ";lkjasdf":
                sb.append("out-in");
                break;
            case "asdfjkl;":
                sb.append("stairs");
                break;
            case ";lkjfdsa":
                sb.append("reverse");
                break;
            default:
                sb.append("molu");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
