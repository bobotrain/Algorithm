import java.util.Arrays;

public class Q12_0616 { //시저암호

   /* 문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s	n	result
"AB"	1	"BC"
"z"	1	"a"
"a B z"	4	"e F d"*/
    public static void main(String[] args) {
     String s = "a B z";
     int n = 4;
     String answer ="";
     char c;


       for(int i =0; i<s.length(); i++) {
           //char으로 변환해서 풀기
           //char이니까 상수의 덧셈으로 (아스키코드표 이용) 변환 가능
           //n만큼 뒤로 밀어야 하므로 n만큼 상수에 가산

           if (s.charAt(i) <= 90 && s.charAt(i) >= 65) { //대문자일때
               if (s.charAt(i) + n > 90) {
                   //알파벳 한바퀴 돌면 다시 A부터
                   answer += Character.toString(s.charAt(i) + n - 26);
               } else {
                   answer += Character.toString(s.charAt(i) + n);
               }
           }else if(s.charAt(i) <= 122 && s.charAt(i) >= 97){ //소문자일떄
               if(s.charAt(i)+n>122){
                   //알파벳 한바퀴 돌면 다시 a부터
                   answer += Character.toString(s.charAt(i)+n-26);
               }else{
                   answer += Character.toString(s.charAt(i)+n);
               }
             }else if (Character.toString(s.charAt(i)).isBlank()){//공백일때
               answer += " ";
           }
       }



        System.out.println(answer);





    }

}
