package programmers;

public class Solution_문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer = false;
		char x;

		if (s.length() == 4 || s.length() == 6) answer = true;

		if (answer == true) {
			for (int i = 0; i < s.length(); i++) {
				x = s.charAt(i);
				if (Character.isDigit(x) == false) answer = false;
			}
		}

		return answer;
	}
	
	//정규표현식으로도 가능...!
	/*
	 
	 class Solution {
		  public boolean solution(String s) {
		        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
		        return false;
		  }
		}
	 
	 */
}