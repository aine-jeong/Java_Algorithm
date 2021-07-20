package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main10818 {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
				//생성자
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
				//키보드를 통해 입력받기
				int N = Integer.parseInt(br.readLine());
				
				//값을 담을 배열
				int[] Array = new int[N];
		        
				//bufferReader 클래스의 메서드로 입력을 읽을 때, 라인 단위로 읽게 된다.
				//특정 문자에 따라 문자열을 나누고 싶을 때 StringTokenizer를 이용하게 된다.
				StringTokenizer st;
				st = new StringTokenizer(br.readLine()," ");
		 
				for (int i = 0; i < N; i++) {
					//new StringTokenizer(문자열, 구분자): 구분자를 기준으로 문자열 분리
					//반환되는 타입이 String이므로, 형변환 (Integer.parseInt)
					//형변환한 두 토큰을 더하여 BufferedWriter.write()에 담기
					//while(st.hasMoreTokens()) {
						Array[i] = Integer.parseInt(st.nextToken());
					//}
				}
				
				int min = 1000000;
				int max = -1000000;
				for(int i = 0; i < Array.length; i++) {
					
					if(Array[i] < min) {
						min = Array[i];
					}
					
					if(Array[i] > max) {
						max = Array[i];
					}
					
				}
				
				bw.write(min + " " + max);
				
				//버퍼 닫기
				br.close();
		        
				//버퍼 비우기, 닫기
				bw.flush();
				bw.close();
	}
}
 