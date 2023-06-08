import java.util.Arrays;
import java.util.Collections;

public class Q8_20230608 {
    /*
    예산 문제

    문제 설명
   S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다.
   그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.

물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다.
예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.

부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

 제한사항
d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.
    * */
    public static void main(String[] args) {

        int[] d = {2,2,3,3};
        int budget=10;
        int answer=0;

        //반드시 오름차순 해둬야함 -> 그래야 작은것부터 차근차근채워나갈것...
        Arrays.sort(d);
        //+@ 내림차순 하는 방법 int 자료형은 반드시 integer로 변환시키고 collection함수 써야함
        // Collections.reverseOrder() 내림차순 정렬은 하지 못합니다. 왜냐하면 Collections은 객체를 대상으로 하니까.. int 는 변수 자료형이지 객체 클래스가 아닙니다
        // 그래서 integer래퍼 클래스로 배열을 만들어서 내림차순으로 만든다.

        //래퍼 클래스란
        //래퍼 클래스(Wrapper class)
        //프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있습니다.

        //예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.
        //이때에는 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.
        //이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.
        //래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.
        //이러한 래퍼 클래스는 모두 java.lang 패키지에 포함되어 제공됩니다.

        //자바의 기본 타입에 대응하여 제공하고 있는 래퍼 클래스는 다음과 같습니다.

        //기본 타입	래퍼 클래스
        //byte	    Byte
        //short	    Short
        //int	    Integer
        //long	    Long
        //float	    Float
        //double	Double
        //char	    Character
        //boolean	Boolean

        //따라서 내림차순 예시
        //1. int[] - > Integer[] 해준다.
        //Integer[] conv = Arrays.stream(a).boxed().toArray(Integer[]::new);

        //2.Integer[]배열 내림차순 정렬
        //Arrays.sort(conv , Collections.reverseOrder());

        //3.Integer[]  -> int[]
        //a = Arrays.stream(conv).mapToInt(Integer::intValue).toArray();

        //이거 어려우니까 그냥 stringbuilder로 해결하자 ~
            for(int i = 0; i<=d.length-1; i++){
                if(d[i]<=budget){
                    budget-=d[i];
                    answer++;
                }

            }


        System.out.println(answer);

    }


}