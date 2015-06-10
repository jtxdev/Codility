// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demoQKS7FR-SAT/

import java.util.Arrays;
import java.math.BigInteger;

public class Triangle {
    public int solution(int[] A) {
        int len = A.length;
        if (A == null || len < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < len - 2; i++) {
        	BigInteger P = BigInteger.valueOf(A[i]);
        	BigInteger Q = BigInteger.valueOf(A[i+1]);
        	BigInteger R = BigInteger.valueOf(A[i+2]);
            if (P.add(Q).compareTo(R) > 0) {
            	return 1;
            }
        }
        return 0;
    }
}
