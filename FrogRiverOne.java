// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoWKD3DM-KUX/

import java.util.HashMap;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        HashMap<Integer, Integer> leaf = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (leaf.get(A[i]) == null) {
                X--;
                leaf.put(A[i], 1);
            }
            if (X == 0) {
                return i;
            }
        }
        return -1;
        
    }
}