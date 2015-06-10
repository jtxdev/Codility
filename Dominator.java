// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoKUB9DT-E2R/
import java.util.HashMap;

public class Dominator {
	public int solution(int[] A) {
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        int len = A.length;
        int highest = 0;
        int dominator = 0;
        for (int i = 0; i < len; i++) {
            int x;
            if (counter.get(A[i]) == null) {
                x = 0;
            } else {
                x = counter.get(A[i]);
            }
            counter.put(A[i], x+1);
            if (x+1 > highest) {
                highest++;
                dominator = i;
            }
        }
        if (highest > len/2.0) {
            return dominator;
        }
        return -1;
    }
}
