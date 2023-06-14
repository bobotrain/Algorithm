import java.util.ArrayList;
import java.util.Collections;

public class Q11_0614 { //3진법 뒤집기

   /* 문제 설명
    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    n은 1 이상 100,000,000 이하인 자연수입니다.
    입출력 예
    n	result
45	7
        125	229
    입출력 예 설명
    입출력 예 #1

    답을 도출하는 과정은 다음과 같습니다.
            n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
45	1200	0021	7
    따라서 7을 return 해야 합니다.
    입출력 예 #2

    답을 도출하는 과정은 다음과 같습니다.
            n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
125	11122	22111	229
    따라서 229를 return 해야 합니다.*/
    public static void main(String[] args) {
      int answer = 0;
      int n = 45;

      //10진수 -> n진수  ( Integer.toString(10진수,n) )
        String third = Integer.toString(n, 3);
        //stringBuffer에 담아서 해결
        String reversed = new StringBuffer(third).reverse().toString();
        System.out.println(reversed);

        int exp = 0;
        for (int i = reversed.length() - 1; i >= 0; i--) {
            //reversed라는 문자열을 charAt으로 캐릭터(한글자)로 각각 하나씩 뽑은 후
            // 3의 0승, 3의 1승, 3의2승 .... 의 순서로 곱해서 10진법화 한다.
            // String.valueOf는 char을 String으로 변환하고 이를 int형태로 받아 answer에 더한다(Integer.parseInt)
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp);
            exp++;
        }
        System.out.println(answer);


    }

}
