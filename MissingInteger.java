// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoP534MK-5PF/

import java.util.HashMap;

public class MissingInteger {
    public int solution(int[] A) {
        HashMap<Integer, Boolean> counter = new HashMap<Integer, Boolean>();
        for (int i = 0; i < A.length; i++) {
            counter.put(A[i], true);
        }
        for (int i = 1; i <= 2147483647; i++) {
            if (counter.get(i) == null) {
                return i;
            }
        }
        return 0;
    }
}