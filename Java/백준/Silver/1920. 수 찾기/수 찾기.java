import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < num; i++) {
			set.add(Integer.parseInt(str[i]));
		}
		
		num = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		
		for (int i = 0; i < num; i++) {
			if (set.contains(Integer.parseInt(str[i]))) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}