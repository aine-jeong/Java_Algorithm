package programmers;

public class Solution_제일작은수제거하기 {
	public int[] solution(int[] arr) {
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}else {
			
			int x = arr.length-1;
	        int[] answer = new int[x];
	        
	        int min = arr[0];
	        
	        for(int i = 1; i < arr.length; i++) {
	        	if(min > arr[i]) min = arr[i];
	        }
	        
	        int j = 0;
	        for(int i = 0; i < arr.length; i++) {
	        	if(arr[i] != min) {
	        		answer[j] = arr[i];
	        		j++;
	        	}
	        }
	        
	        return answer;
		}
    }
}