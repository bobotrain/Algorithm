
import java.util.Arrays;

public class Q10_0614 {
    /* 문제 설명
 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

 제한 사항
 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 입출력 예
 s	return
 "try hello world"	"TrY HeLlO WoRlD"
 입출력 예 설명
 "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다.
 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.*/
    public static void main(String[] args) {
        String s = "aaaaa aaaaaa aaaa aaa aaaaaa aaaaaaaaaaaaaaa";
        String answer = "";
        int cnt=0;
        //공백 기준으로 단어 3개로 나눔
        String[] array = s.split(" ");
        //{ try, hello, world } 나옴

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }

      /*  //각 단어 담을 문자열
        String a ="";
        //length : array 길이 / size : arraylist크기 / length() : 문자열 길이
        //j 는 0 1 2 까지 돔 -> 단어 총 3개임
        for(int j =0; j< array.length; j++) {
            a= array[j];
            //각 단어별로 대문자 변환작업
            for (int i = 0; i <= a.length()-1; i++){
                if (i == 0 || i % 2 == 0) {
                    //대문자 변환 -> .toUpperCase()
                    answer += a.substring(i,i+1).toUpperCase();
                } else {
                    //소문자 변환 -> .toLowerCase()
                    answer += a.substring(i,i+1).toLowerCase();
                }
            }
            //단어 사이에 공백 넣어주기 ( 맨 마지막은 제외)
            if(j!=array.length-1) {
                answer += " ";
            }
        }*/

        System.out.println(answer);

    }

}
