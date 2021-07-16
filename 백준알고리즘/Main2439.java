package baekjoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main2439 {
 
	public static void main(String[] args) throws IOException {
		//BufferedReader, BufferedWriter 사용시 예외처리 필수
		
		//생성자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		//키보드를 통해 입력받기
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			//공백 개수
			int space = N-i;
			//공백
			for(int j = 0; j < space; j++) {
				bw.write(" ");
			}
			
			//별
			for(int k = 0; k < i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		//버퍼 닫기
		br.close();
        
		//버퍼 비우기, 닫기
		bw.flush();
		bw.close();
 
	}
}
 