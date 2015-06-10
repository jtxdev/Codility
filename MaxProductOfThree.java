// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demoBRS3XJ-SBG/

import java.util.Arrays;
import java.lang.Math;

public class MaxProductOfThree {
    public int solution(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        int best = A[len-1]*A[len-2]*A[len-3];
        int test = A[0]*A[1]*A[len-1];
    
        return Math.max(best, test);
    }
}