package baekjoon;

import java.util.Scanner;
 
public class Main1110 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N은 초기 숫자, M은 연산 결과, x는 사이클의 길이
		int N, M;
		int x = 0;
		N = sc.nextInt();
		
		if(N < 10) {
			M = (N*10) + N;
			x++;
		}else {
			//두자릿수의 앞자리
			int tens = N / 10;
			//두자릿수의 뒷자리
			int num = N % 10;
			
			int sum = tens + num;
			if(sum >= 10) {
				sum = sum%10;
			}
			
			M = (num*10) + sum;
			x++;
		}
		
		while(M != N) {
			x++;
			//연산결과의 앞자리
			int tens = M / 10;
			//연산결과의 뒷자리
			int num = M % 10;
			
			int sum = tens + num;
			if(sum >= 10) {
				sum = sum%10;
			}
			
			M = sum + (num*10);
		}
		
		System.out.println(x);
		
	}
}
 