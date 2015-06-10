// Author Jason Thai 11/06/2015
// https://codility.com/demo/results/demoRRTWZW-VWH/

public class Brackets {
	public int solution(String S) {
        int len = S.length();
        char stack[] = new char[len+1];
        int st = 0;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == '{' || S.charAt(i) == '[' || S.charAt(i) == '(') {
                stack[++st] = S.charAt(i);
            } else if (S.charAt(i) == '}') {
                if (stack[st] == '{') {
                    st--;
                } else {
                    return 0;
                }
            } else if (S.charAt(i) == ')') {
                if (stack[st] == '(') {
                    st--;
                } else {
                    return 0;
                }
            } else if (S.charAt(i) == ']') {
                if (stack[st] == '[') {
                    st--;
                } else {
                    return 0;
                }
            } 
        }
        if (st != 0) {
        	return 0;
        }
        return 1;
    }
}
