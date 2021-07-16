package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main2741 {
 
	public static void main(String[] args) throws IOException {
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
		//생성자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		//키보드를 통해 입력받기
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 1; i <= N; i++) {
			bw.write(i+ "\n");
		}
		//버퍼 닫기
		br.close();
        
		//버퍼 비우기, 닫기
		bw.flush();
		bw.close();
 
	}
}
 