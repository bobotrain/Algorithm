package Main;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        StringBuilder a = new StringBuilder();
        a.append(sc.next());
        sc.close();

        int b = 0;
       
        for(int i = 0; i<a.length(); i++){
            if(65<=(int)a.charAt(i) && (int)a.charAt(i)<=67){
                b+=3;
            }else if(68<=(int)a.charAt(i) && (int)a.charAt(i)<=70){
                b+=4;
            }else if(71<=(int)a.charAt(i) && (int)a.charAt(i)<=73){
                b+=5;
            }else if(74<=(int)a.charAt(i) && (int)a.charAt(i)<=76){
                b+=6;
            }else if(77<=(int)a.charAt(i) && (int)a.charAt(i)<=79){
                b+=7;
            }else if(80<=(int)a.charAt(i) && (int)a.charAt(i)<=83){
                b+=8;
            }else if(84<=(int)a.charAt(i) && (int)a.charAt(i)<=86){
                b+=9;
            }else if(87<=(int)a.charAt(i) && (int)a.charAt(i)<=90){
                b+=10;
            }

            
        }
        System.out.println(b);
       
    }
}