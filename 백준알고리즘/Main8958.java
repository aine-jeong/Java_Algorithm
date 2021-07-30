package baekjoon;

import java.util.Scanner;

public class Main8958 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		//sc.next();
		//sc.nextInt();
		//String[] OXArray = new String[testCase];
		int[] scoreArray = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			String OXquiz = sc.next();
			String[] OXArray = OXquiz.split("");
			
			int score = 0;
			int num = 0;
			for(int j = 0; j < OXArray.length; j++) {
				 if(OXArray[j].equals("O")) {
					 num++;
					 score = score + num;
				 }else if(OXArray[j].equals("X")) {
					 num = 0;
				 }
				 
				 if(j == OXArray.length-1) {
					 scoreArray[i] = score;
					 score = 0;
				 }
			}
		}
		
		for(int i =0 ; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
		}
	}
}
 