// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demoSTWRNJ-EB9/

import java.math.BigInteger;
import java.util.Arrays;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int len = A.length;
        if (A == null || len <= 1) {
            return 0;
        }
        int res = 0;
        
        BigInteger[] left = new BigInteger[len];
        BigInteger[] right = new BigInteger[len];
        
        for (int i = 0; i < len; i++) {
            BigInteger R = BigInteger.valueOf(A[i]);
            left[i] = BigInteger.valueOf(i).subtract(R);
            right[i] = BigInteger.valueOf(i).add(R);
        }
        
        Arrays.sort(left);
        Arrays.sort(right);
        
        int lefthead = 0;
        int righthead = 0;
        int active = 0;
        while (lefthead < left.length && left[lefthead].compareTo(BigInteger.ZERO) < 0) {
            res += active;
            active++;
            lefthead++;
            if (res > 10000000) {
                return -1;
            }
        }
        
        while (lefthead < left.length) {
            while (righthead < right.length && 
            right[righthead].compareTo(left[lefthead]) < 0) {
                active--;
                righthead++;
            }
            res += active;
            active++;
            lefthead++;
            if (res > 10000000) {
                return -1;
            }
        }
        
        return res;
    }
}