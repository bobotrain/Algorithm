import java.util.ArrayList;
import java.util.Arrays;

public class Q4_20230605_2 {
    /*
    <문제>
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

        제한 조건
        n은 10,000,000,000이하인 자연수입니다.
        입출력 예
        n	return
        12345	[5,4,3,2,1]
    * */
    public static void main(String[] args) {
        int n =12345;
        int cnt =0;
        long n1 =n;
        while(n>0){
            n/=10;
            cnt++;
        }
        int[] answer = new int[cnt];
        long k =0;
        for(int i = 0; i<= answer.length-1; i++ ){
            k=n1%10;
            answer[i] = (int)k;
            n1/=10;
        }

        System.out.println(Arrays.toString(answer));

    }
}
