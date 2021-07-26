package baekjoon;

import java.util.Scanner;

public class Main3052 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] Array = new int[10];
		
		//서로 다른 나머지 세는 변수
		int answer = 0;
		boolean boo = false;
		
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt() % 42;
			Array[i] = num;
		}
		
		for(int i = 0; i < Array.length; i++) {
			boo = false;
			for(int j = i+1; j < Array.length; j++) {
				if(Array[i]==Array[j]) {
					boo = true;
					break;
				}
			}
			if(boo==false) answer++;
		}
		
		System.out.println(answer);
		
	}
}
 