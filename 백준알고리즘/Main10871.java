package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

 
public class Main10871 {
 
	public static void main(String[] args) throws IOException {
		// throws IOException
		
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
		//생성자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//bufferReader 클래스의 메서드로 입력을 읽을 때, 라인 단위로 읽게 된다.
		//특정 문자에 따라 문자열을 나누고 싶을 때 StringTokenizer를 이용하게 된다.
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		//정수 N개로 이루어진 수열 A와 정수 X
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		//수열 A를 이루는 정수 N개 받아서 공백 기준으로 자르기
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] A = new int[N];
		
		//배열에 각각의 정수 넣기
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		//버퍼에 X보다 작은 수를 입력
		for(int i = 0; i < A.length; i++) {
			if(A[i] < X) {
				bw.write(A[i] + " ");
			}
		}
		
		//버퍼 닫기
		br.close();
        
		//버퍼 비우기, 닫기
		bw.flush();
		bw.close();
 
	}
}
 