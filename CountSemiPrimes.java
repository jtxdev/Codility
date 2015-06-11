// you can also use imports, for example:
import java.util.Arrays;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class CountSemiPrimes {
    public int[] solution(int N, int[] P, int[] Q) {
        int maxN = 50000;
        
        boolean[] prime = new boolean[maxN+1];
        Arrays.fill(prime, Boolean.TRUE);
        //Sieve
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) continue;
            for (int j = 2*i; j <= N; j = j+i) {
                prime[j] = false;
            }
        }
        
        boolean[] semiprime = new boolean[maxN+1];
        
        for (int i = 1; i <= N; i++) {
            if (!prime[i]) continue;
            if (semiprime[i]) continue;
            for (int j = i; j <= N/2; j++) 
            {
                if (i * j > N) break;
                if (!prime[j]) continue;
                semiprime[i*j] = true;
            }
        }
        
        int[] cumsum = new int[N+1];
        cumsum[0] = 0;
        for (int i = 1; i <= N; i++) {
             if (semiprime[i]) {
                cumsum[i]++;
             }
             cumsum[i] += cumsum[i-1];
        }
        int[] ans = new int[P.length];
        int a = 0;
        for (int i = 0; i < P.length; i++) {
            ans[a++] = cumsum[Q[i]] - cumsum[P[i]-1];
        }
        return ans;
    }
}
