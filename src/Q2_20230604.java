import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//문자열 내림차순으로 배치하기
public class Q2_20230604 {
    public static void main(String[] args) {
/*      문제 설명

        문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
                s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

        제한 사항

        str은 길이 1 이상인 문자열입니다.
        입출력 예
        s	return
        "Zbcdefg"	"gfedcbZ"
                */


       String s = "Zbcdefg";



       String answer="";
       ArrayList<String> A = new ArrayList<>();
       for(int i =0; i<=s.length()-1; i++){
           A.add(s.substring(i,i+1));
       }
        //내림차순 뒤집기 ( 알파벳은 내림차순 적용 가능 )
        //방법1) Collections.sort(A, Collections.reverseOrder());
        //방법2) Comparator 쓰기
        A.sort(Comparator.reverseOrder());

       for(int i=0; i<=A.size()-1; i++){
            answer+=A.get(i);
       }

        System.out.println(answer);

    }

}
