import java.io.*;

import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");

		int num1 = Integer.parseInt(str[0]);

		int num2 = Integer.parseInt(str[1]);

		Set<String> nonSaw = new HashSet<>();

		Set<String> nonHeard = new HashSet<>();

		for (int i = 0; i < num1; i++) {

			nonSaw.add(br.readLine());

		}

		for (int i = 0; i < num2; i++) {

			nonHeard.add(br.readLine());

		}

		nonSaw.retainAll(nonHeard);

		List<String> result = new ArrayList<>(nonSaw);

		Collections.sort(result);

		bw.write(result.size() + "\n");

		for (String name : result) {

			bw.write(name + "\n");

		}

		bw.flush();

		bw.close();

		br.close();

	}

}