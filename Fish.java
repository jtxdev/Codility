// Author: Jason Thai 11/06/2015
// https://codility.com/demo/results/demo6DJ7WV-JUY/

public class Fish {
    public int solution(int[] A, int[] B) {
        int len = A.length;
        
        int[] stack = new int[len];
        int st = 0;
        
        int living = 0;
        for (int i = 0; i < len; i++) {
            if (B[i] == 1) {
                stack[++st] = i;
            } else {
                if (st == 0) {
                    // System.out.println(i + "lives");
                    living++;
                } else {
                    while (A[stack[st]] < A[i] && st > 0) {
                        // System.out.println(i + "ATE" + stack[st]);
                        st--;
                    } 
                    if (st == 0) {
                        // System.out.println(i + "lives");
                        living++;
                    }
                }
            }
        }
        living += st;
        return living;
    }
}

