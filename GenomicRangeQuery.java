// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demoPRGQVN-4VC/
	
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] ACGT = new int[S.length()][3]; //We don't care about T
        
        if (S.charAt(0) == 'A') {
            ACGT[0][0] = 1;
        }
        if (S.charAt(0) == 'C') {
            ACGT[0][1] = 1;
        }
        if (S.charAt(0) == 'G') {
            ACGT[0][2] = 1;
        }
        
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == 'A') {
                ACGT[i][0] = 1;
            }
            if (S.charAt(i) == 'C') {
                ACGT[i][1] = 1;
            }
            if (S.charAt(i) == 'G') {
                ACGT[i][2] = 1;
            }
            ACGT[i][0] += ACGT[i-1][0];
            ACGT[i][1] += ACGT[i-1][1];
            ACGT[i][2] += ACGT[i-1][2];
        }
        
        int[] ans = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int p = P[i];
            int q = Q[i];
            
            if (ACGT[p][0] < ACGT[q][0]) {
                ans[i] = 1;
            } else if (ACGT[p][1] < ACGT[q][1]) {
                ans[i] = 2;
            } else if (ACGT[p][2] < ACGT[q][2]) {
                ans[i] = 3;
            } else {
                ans[i] = 4;
            }
        }
        return ans;
        
    }
}