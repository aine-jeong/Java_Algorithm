package baekjoon;

import java.util.Scanner;

public class Main15596 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(sum(new int[n]));
		
	}
	
	public static long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		
		return sum;
	}
}
 