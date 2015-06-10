// Author Jason Thai 11/06/2015
// https://codility.com/demo/results/demo337NVN-BFE/

public class StoneWall {
	 public int solution(int[] H) {
        int[] stack = new int[H.length+10];
        int st = 0;
        int blocks = 0;
        for (int i = 0; i < H.length; i++) {
            if (stack[st] < H[i]) {
                // System.out.println("Up to " + H[i]); 
                stack[++st] = H[i];
            } else if (stack[st] > H[i]) {
                while (stack[st] > H[i]) {
                    st--;
                    // System.out.println("Down to " + stack[st]); 
                    blocks++;
                }
                // System.out.println("Up to " + H[i]); 
                if (stack[st] < H[i]) {
                    stack[++st] = H[i];
                }
            }
        }
        while (st > 0) {
            st--;
            blocks++;
        }
        return blocks;
    }
}
