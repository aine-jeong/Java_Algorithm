package baekjoon;

import java.util.Scanner;

public class Main2577 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		long multi = (long)A*B*C;
		
		
		
		String number = String.valueOf(multi);
		
		char[] Array = number.toCharArray();
		
		int[] answer = new int[10];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = 0;
		}
		
		
		for(int i = 0; i < Array.length; i++) {
			switch (Array[i]) {
				case '0': 
					answer[0] = answer[0] + 1;
					break;
				case '1':
					answer[1] = answer[1] + 1;
					break;
				case '2': 
					answer[2] = answer[2] + 1;
					break;
				case '3':
					answer[3] = answer[3] + 1;
					break;
				case '4': 
					answer[4] = answer[4] + 1;
					break;
				case '5':
					answer[5] = answer[5] + 1;
					break;
				case '6': 
					answer[6] = answer[6] + 1;
					break;
				case '7':
					answer[7] = answer[7] + 1;
					break;
				case '8':
					answer[8] = answer[8] + 1;
					break;
				case '9':
					answer[9] = answer[9] + 1;
					break;
			}
			
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		

	}
}
 