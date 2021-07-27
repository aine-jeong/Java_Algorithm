package baekjoon;

import java.util.Scanner;

public class Main1546 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//시험 본 과목의 개수
		int N = sc.nextInt();
		
		//주어지는 점수
		sc.nextLine();
		String score = sc.nextLine();
		String[] Array = score.split(" ");
		
		//점수 중 최댓값
		int max = 0;
		
		int[] scoreArray = new int[N];
		//String 배열 int형으로 변환, 최댓값 구하기
		for(int i = 0; i < N; i++) {
			scoreArray[i] = Integer.parseInt(Array[i]);
			if(scoreArray[i] > max) max = scoreArray[i];
		}
		
		//점수 합계
		double sum = 0;
		
		//고친 점수로 합계 구하기
		for(int i = 0; i < N; i++) {
			double exScore = scoreArray[i];
			double newScore = (double)exScore/max*100;
			sum = sum + newScore;
		}
		
		System.out.println(sum/N);
		
	}
}
 