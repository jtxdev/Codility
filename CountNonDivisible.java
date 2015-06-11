// https://codility.com/demo/results/demoPT6UGG-6FV/
import java.util.HashSet;
import java.util.Arrays;

public class CountNonDivisible {
	private static final int MAXN = 100000;
    public int[] solution(int[] A) {
        
        int[] count = new int[MAXN+1];
        for (int a : A) {
            count[a]++;
        }
        int[] nondivs = new int[MAXN+1];
        Arrays.fill(nondivs, A.length);
        
        HashSet<Integer> Distinct = new HashSet<Integer>();
        
        for (int a : A) {
            Distinct.add(a);
        }
        
        for (int d : Distinct) {
            for (int i = d; i <= MAXN; i = i+d) {
                nondivs[i] -= count[d];
            }
        }
        
        int[] result = new int[A.length];
        int r = 0;
        for (int a : A) {
            result[r++] = nondivs[a];
        }
        return result;
    }
}
