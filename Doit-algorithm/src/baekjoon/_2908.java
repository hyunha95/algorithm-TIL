package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        char[] chArr1 = strArr[0].toCharArray();
        char[] chArr2 = strArr[1].toCharArray();

        String str1 = "";
        String str2 = "";
        for (int i = chArr1.length - 1; i >= 0; i--) {
            str1 += chArr1[i] + "";
        }
        for (int i = chArr2.length - 1; i >= 0; i--) {
            str2 += chArr2[i] + "";
        }
        System.out.println(Math.max(Integer.parseInt(str1), Integer.parseInt(str2)));

    }
}
