// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoETPEZ2-DZA/

public class Dominator {
	public int solution(int[] A) {
        int len = A.length;
        int st = 0;
        int top = 0;
        for (int i = 0; i < len; i++) {
            if (st == 0) {
                st++;
                top = A[i];
            } else {
                if (top != A[i]) {
                    st--;
                } else {
                    st++;
                }
            }
        }
        if (st > 0) {
            int count = 0;
            int index = 0;
            for (int i = 0; i < len; i++) {
                if (A[i] == top) {
                    count++;
                    index = i;
                }
            }
            if (count > len/2.0) {
                return index;
            }
        }
        return -1;
    }
}
