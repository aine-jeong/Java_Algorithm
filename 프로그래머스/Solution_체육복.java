class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -10;
                    reserve[j] = -10;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1) {
                    answer++;
                    reserve[j] = -10;
                    break;
                } else if (lost[i] == reserve[j] - 1) {
                    answer++;
                    reserve[j] = -10;
                    break;
                }
            }
        }
            
        
        return answer;
    }
}