import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        //각 학생이 문제의 수만큼 찍은 배열
        int[] supo01 = new int[answers.length];
        int[] supo02 = new int[answers.length];
        int[] supo03 = new int[answers.length];
        
        
        int count = 1; // 배열에 넣기 위한 변수
        for(int i = 0; i < answers.length ; i++) {
            // count를 1~5 반복하면서 배열 길이만큼 넣기
            supo01[i] = count;
            count = (count<5) ? ++count : 1;
        }
        
        //supo02는 2,1,2,3,2,4,2,5 반복
        int[] supo02num = new int[]{2,1,2,3,2,4,2,5};
        int supo02index = 0;
        for(int i = 0; i < answers.length ; i++) {
            supo02[i] = supo02num[supo02index];
            supo02index = (supo02index < supo02num.length-1) ? ++supo02index : 0 ;
        }
        
        //supo03은 3,3,1,1,2,2,4,4,5,5 반복
        int[] supo03num = new int[] {3,3,1,1,2,2,4,4,5,5};
        int supo03index = 0;
        for(int i = 0; i < answers.length ; i++) {
            supo03[i] = supo03num[supo03index];
            supo03index = (supo03index < supo03num.length-1) ? ++supo03index : 0 ;
        }
        
        //각 학생의 점수
        int supo01Score = 0;
        int supo02Score = 0;
        int supo03Score = 0;
        
        //채점
        for(int i = 0; i < answers.length ; i++) {
            if(answers[i] == supo01[i]) supo01Score++;
            if(answers[i] == supo02[i]) supo02Score++;
            if(answers[i] == supo03[i]) supo03Score++;
        }
        
        //학생 점수 배열
        int[] score = new int[] {supo01Score,supo02Score,supo03Score};
        //가장 많은 문제를 맞힌 사람의 점수
        int highest = 0;
        
        for(int i = 0; i < score.length; i++) {
            if(score[i]>=highest) highest = score[i];
        }
        
        
        List<Integer> sub_answer = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
          if(score[i]==highest) {
              sub_answer.add(i+1);
          }
        } 
        
        int[] answer = new int[sub_answer.size()];
        int size = 0;
        for(int x : sub_answer) {
            answer[size++] = x;
        }
        
        return answer;
    }
}