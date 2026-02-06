class Solution {
int[] temp = new int[5];
    int answer = 0;

    public int solution(int n, int[][] q, int[] ans) {
        dfs(0, 1, n, q, ans);
        return answer;
    }

    void dfs(int depth, int start, int n, int[][] q, int[] ans) {
        if (depth == 5) {
            if (check(q, ans)) {
                answer++;
            }
            return;
        }

        for (int i = start; i <= n; i++) {
            temp[depth] = i;
            dfs(depth + 1, i + 1, n, q, ans);
        }

    }

    boolean check(int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (temp[j] == q[i][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count != ans[i]) {
                return false;
            }
        }
        return true;
    }
}