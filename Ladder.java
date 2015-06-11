//https://codility.com/demo/results/demoESC3V4-WR6/

public class Ladder {
	private static final int MAXN = 30000;
    public int[] solution(int[] A, int[] B) {
        int N = A.length;
        int [] pow2 = new int[31];
        pow2[0] = 1;
        pow2[1] = 2;
        for (int i = 2; i < 31; i++) {
            pow2[i] = 2 * pow2[i-1];
        }
        
        int[] dp = new int[MAXN+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % pow2[30];
        }
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = (int) (dp[A[i]] % pow2[B[i]]);
        }
        return res;
    }
}
