package programmers;

import java.util.Arrays;

public class Solution_K번째수{
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
    	
		int[] answer = solution(array, commands);
		 
		for(int i : answer) {
			System.out.println( i );
		}
    }
	
    public static int[] solution(int[] array, int[][] commands) {
    	//정답 개수만큼의 길이로 배열 생성
        int[] answer = new int[commands.length];
        
        //주어진 commands의 길이만큼 반복
        for(int i = 0; i < commands.length; i++) {
        	//1. 자르기
        	int x = commands[i][0]-1;
        	int y = commands[i][1];
        	
        	int[] sliceArray = Arrays.copyOfRange(array, x, y);
        	
        	//2. 정렬하기
        	Arrays.sort(sliceArray);
        	
        	//3. k번째 수 저장
        	int k = commands[i][2]-1;
        	answer[i] = sliceArray[k];
        }
        
        return answer;
    }
}