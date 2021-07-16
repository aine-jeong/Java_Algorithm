package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main15552 {
 
	public static void main(String[] args) throws IOException {
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
		//생성자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		//키보드를 통해 입력받기
		int N = Integer.parseInt(br.readLine());
        
		//bufferReader 클래스의 메서드로 입력을 읽을 때, 라인 단위로 읽게 된다.
		//특정 문자에 따라 문자열을 나누고 싶을 때 StringTokenizer를 이용하게 된다.
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			//new StringTokenizer(문자열, 구분자): 구분자를 기준으로 문자열 분리
			st = new StringTokenizer(br.readLine()," ");
			//반환되는 타입이 String이므로, 형변환 (Integer.parseInt)
			//형변환한 두 토큰을 더하여 BufferedWriter.write()에 담기
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		//버퍼 닫기
		br.close();
        
		//버퍼 비우기, 닫기
		bw.flush();
		bw.close();
 
	}
}
 