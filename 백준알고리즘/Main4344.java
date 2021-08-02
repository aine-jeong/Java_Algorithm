package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
				//생성자
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
				//키보드를 통해 입력받기
				//테스트 케이스의 개수
				int C = Integer.parseInt(br.readLine());
				
				//백분율을 담을 배열
				//double[] AvgArray = new double[C];
		        
				StringTokenizer st;
				
				for (int i = 0; i < C; i++) {
				st = new StringTokenizer(br.readLine()," ");
				
				int student = Integer.parseInt(st.nextToken());
				int[] ScoreArray = new int[student];
					
				int sum = 0;
				double avg = 0;
					for(int j = 0; j < student; j++) {
						int score = Integer.parseInt(st.nextToken());
						ScoreArray[j] = score;
						sum = sum + score;
					}
					
				avg = (double)sum/student;
				
				int highStudent = 0;
				
				for(int k = 0; k < student; k++) {
					if(ScoreArray[k] > avg) {
						highStudent++;
					}
				}
				
				//AvgArray[i] = (double)highStudent/student*100;
				double answer = (double)highStudent/student*100;
			
				String A = String.format("%.3f", answer);	
				bw.write(A+"%");
				bw.newLine();
				}
				
				
				//버퍼 닫기
				br.close();
		        
				//버퍼 비우기, 닫기
				bw.flush();
				bw.close();
	}
}
 