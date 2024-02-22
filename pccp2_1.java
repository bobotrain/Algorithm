import java.util.*;

class Solution {
    public int[] solution(String command) {
        
        int x = 0;
        int y = 0;
        
        // 방향
        int k = 0;
        
        for (int i = 0; i < command.length(); i++) {
            if (String.valueOf(command.charAt(i)).equals("G")) {
                if (k == 0) { // 위
                    y++;
                } else if (k == 1) { // 오른쪽
                    x++;
                } else if (k == 2) { // 아래
                    y--;
                } else if (k == 3) { // 왼쪽
                    x--;
                }
                
            } else if (String.valueOf(command.charAt(i)).equals("B")) {
                if (k == 0) { // 위
                    y--;
                } else if (k == 1) { // 오른쪽
                    x--;
                } else if (k == 2) { // 아래
                    y++;
                } else if (k == 3) { // 왼쪽
                    x++;
                }
            } else if (String.valueOf(command.charAt(i)).equals("L")) {
                if (k == 0) {
                    k = 3;
                } else {
                    k--;
                }
            } else if (String.valueOf(command.charAt(i)).equals("R")) {
                if (k == 3) {
                    k = 0;
                } else {
                    k++;
                }
            }
        }
        
        int[] answer = {x, y};
        return answer;
    }
}
