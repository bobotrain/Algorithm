import java.util.*;

class Solution {
    public int solution(int[] ability, int number) {

        for(int j=0; j<number; j++){
            Arrays.sort(ability);
            int x = ability[0];
            int y = ability[1];
            ability[0]= x+y;
            ability[1]= x+y;
        }
        
        int answer=0;
        for(int i=0; i<ability.length; i++){
        answer += ability[i];
        }
         
        return answer;
    }
}