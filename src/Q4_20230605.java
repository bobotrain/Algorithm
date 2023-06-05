import java.util.ArrayList;

public class Q4_20230605 {
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
        long n = 12345;
        long k=n;
        int cnt = 0;

        while(k>=10){
            cnt++;
            k= k/10;
        }
        // cnt 4 도출

        ArrayList<Long> answer = new ArrayList<Long>();
        //cnt개수가 몇의자리인지 알려줌
        //즉 0,1,2,3,4 까지 총 5번의 숫자가 도출
        for(int i=0; i<=cnt; i++){
            long a = n%10;
            System.out.println(a);
            n=n/10;
            System.out.println(n);
            answer.add(a);

        }
        System.out.println(answer);
    }
}
