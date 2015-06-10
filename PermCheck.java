// Author: Jason Thai 10/6/2015
// https://codility.com/demo/results/demo7X894U-MQK/

public class PermCheck {
    public int solution(int[] A) {
        int[] count = new int[100010];
        for (int i : A) {
            if (i > 100000) {
                return 0;
            }
            count[i]++;
        }
        for (int i = 1; i <= A.length; i++) {
            if (count[i] != 1) {
                return 0;
            }
        }
        return 1;
    }
}