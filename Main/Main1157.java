package Main;

import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        int[] a = new int[26];

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                a[input.charAt(i) - 65]++;
            } else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                a[input.charAt(i) - 97]++;
            }
        }

        int maxCount = 0;
        char answer = '?';

        for (int i = 0; i < 26; i++) {
            if (a[i] > maxCount) {
                maxCount = a[i];
                answer = (char) (i + 65);
            } else if (a[i] == maxCount) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
