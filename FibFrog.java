// https://codility.com/demo/results/demo3QAWPU-MVR/

import java.util.Arrays;
import java.lang.Math;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class FibFrog {
    private static final int MAXFIB = 30;
    public int solution(int[] A) {
        int N = A.length;
        if (N < 3) return 1;
        int[] fib = new int[MAXFIB];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < MAXFIB; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            // System.out.println(fib[i]);
        }
        
        int[] dp = new int[N+1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < N; i++) {
            if (A[i] == 1) {
                // System.out.println("At " + i);
                for (int j = 2; j < MAXFIB; j++) {
                    // System.out.println(i + " - " + fib[j] + " = " + (i - fib[j]));
                    if (i - fib[j] < -1) break;
                    if (i - fib[j] == -1) {
                        dp[i] = 1;
                    } else if (A[i - fib[j]] == 1 && dp[i - fib[j]] != -1) {
                        if (dp[i] == -1) {
                            dp[i] = dp[i - fib[j]] + 1;
                        } else {
                            dp[i] = Math.min(dp[i], dp[i - fib[j]] + 1);
                        }
                    }
                }
                // System.out.println(dp[i]);
            }
        }
        
        for (int j = 2; j < MAXFIB; j++) {
            // System.out.println(N + " " + j + " = " + fib[j]);
            if (N - fib[j] < -1) break;
            if (N - fib[j] == -1) {
                dp[N] = 1;
            } else if (dp[N - fib[j]] != -1) {
                if (dp[N] == -1) {
                    dp[N] = dp[N - fib[j]] + 1;
                    // System.out.println(dp[N] + " " + (N-fib[j]));
                } else if (A[N - fib[j]] == 1) {
                    dp[N] = Math.min(dp[N], dp[N - fib[j]] + 1);
                    // System.out.println(dp[N] + " " + (N-fib[j]));
                }
            }
            // System.out.println(dp[N]);
        }
        return dp[N];
    }
}
