// Author Jason Thai 11/06/2015
// https://codility.com/demo/results/demoYKBMBH-Z43/
	
public class Nesting {
	class Solution {
	    public int solution(String S) {
	        int len = S.length();
	        int st = 0;
	        for (int i = 0; i < len; i++) {
	            if (S.charAt(i) == '(') {
	                st++;
	            } else {
	                st--;
	            }
	        }
	        if (st != 0) {
	            return 0;
	        }
	        return 1;
	    }
	}
}
