import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    static BufferedWriter bw = new BufferedWriter(
        new OutputStreamWriter(System.out)
    );
    static StringBuilder sb = new StringBuilder();

    static class RankClass implements Comparable<RankClass> {

        int docRank;
        int interviewRank;

        public RankClass(int docRank, int interviewRank) {
            this.docRank = docRank;
            this.interviewRank = interviewRank;
        }

        public int compareTo(RankClass o) {
            return this.docRank - o.docRank;
        }
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            List<RankClass> rankClasses = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int docRank = Integer.parseInt(st.nextToken());
                int interviewRank = Integer.parseInt(st.nextToken());

                rankClasses.add(new RankClass(docRank, interviewRank));
            }

            Collections.sort(rankClasses);

            int minInterviewRank = rankClasses.get(0).interviewRank;

            int result = rankClasses.size();
            for (int j = 1; j < N; j++) {
                RankClass rankClass = rankClasses.get(j);

                if (rankClass.interviewRank < minInterviewRank) {
                    minInterviewRank = rankClass.interviewRank;
                } else {
                    result--;
                }
            }

            sb.append(result).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}