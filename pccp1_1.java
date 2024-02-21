package com.group.libraryapp.controller.calculator;
import java.util.*;

public class pccp1_1 {
    public static void main(String[] args) {
        String input_string = "string";
        String a = input_string;
        int cnt = 0;

        //외톨이 알파벳 후보자.
        ArrayList<String> result = new ArrayList<>();
        boolean exist = true;
        for(int i = 0; i<a.length(); i++){
            cnt++;
            for(int j=1; j<a.length(); j++){
                if(a.charAt(i)==a.charAt(j)){
                    cnt++;
                }
            }
            if(cnt>=2){
               if(!result.contains(String.valueOf(a.charAt(i)))) {
                   result.add(String.valueOf(a.charAt(i)));
               }
            }
            cnt=0;
        }
        //후보군 알파벳을 알파벳 순 정렬
        Collections.sort(result);

        //정답
        String answer = "";

        //정답 중복제거용
        ArrayList<String> resultList = new ArrayList<>();
        //후보군 알파벳 중 순서대로 외톨이인지 판단
        for(String l : result) {
            for(int i =0; i<a.length(); i++){
                if(l.equals(String.valueOf(a.charAt(i)))) {
                    cnt-=i;
                    break;

                }
            }
            //뒤부터
            for(int i=a.length()-1; i>=cnt; i--){
                if(l.equals(String.valueOf(a.charAt(i)))){
                    cnt+=i;
                    break;
                }
            }
            int alpabatcount=0;
            //알파벳 총 개수
            for(int i=0; i<a.length(); i++){
                if(l.equals(String.valueOf(a.charAt(i)))){
                    alpabatcount++;
                }
            }

            if((cnt+1)!=alpabatcount){
                answer+= l;

            }
            cnt=0;
            alpabatcount=0;

        }

        if(answer.equals("")){
            System.out.println("N");
        }else{
            System.out.println(answer);
        }

    }
}
