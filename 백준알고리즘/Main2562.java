package baekjoon;

import java.util.Scanner;

public class Main2562 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] Array = new int[9];
		//최대값과 위치 저장
		int max = 0;
		int x = 0;
		
		for(int i = 0; i < Array.length; i++) {
			Array[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < Array.length; i++) {
			if(max <= Array[i]) {
				max = Array[i];
				x = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(x);

	}
}
 