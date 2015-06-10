// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demoCN4JXC-ZVH/

public class PermMissingElem {
    public int solution(int[] A) {
        int total = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            total += i;
        }
        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }
        return total;
    }
}