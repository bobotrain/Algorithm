import java.util.*;

public class back_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        ArrayList<String> b = new ArrayList<>();
        for(int i =0; i<a.length(); i++){
            b.add(String.valueOf(a.charAt(i)));
        }
        ArrayList<String> c = new ArrayList<>(b);
        Collections.reverse(c);
        if(b.equals(c)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }


}
