package baekjoon;

import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chArr = alphabet.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            System.out.print(str.indexOf(chArr[i] + "") + " ");
        }
    }
}
