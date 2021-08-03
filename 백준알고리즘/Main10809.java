package baekjoon;

import java.util.Scanner;

public class Main10809 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//입력된 문자열의 개수를 길이로 하는 byte 배열 생성
		byte[] strArray = new byte[str.length()];
		
		//문자열의 한 문자씩 byte 단위로 저장하기
		for(int i = 0; i < str.length(); i++) {
			//형변환해서 저장
			strArray[i] = (byte)str.charAt(i);
		}
		
		
		//한 번 이상 나왔는지 체크할 배열
		boolean[] once = new boolean[26];
		//알파벳의 아스키코드를 담은 배열
		int[] alphabet = new int [26];
		for(int i = 0; i < 26; i++) {
			once[i] = false;
			alphabet[i] = i+97;
		}
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(once[j]==false) {
					if(alphabet[j] == strArray[i]) {
						alphabet[j] = i;
						once[j] = true;
					}
				}
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			if(once[i]==false) {
				alphabet[i] = -1;
			}
			
			System.out.print(alphabet[i] + " ");
		}
		
		
	}
}
 