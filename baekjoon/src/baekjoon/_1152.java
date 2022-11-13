package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int cnt = 0;

            for (int i = 0; i < strArr.length; i++) {
                try {
                    String temp = strArr[i].charAt(0) + "";
                    cnt++;
                } catch (Exception e) {

                }
            }

        System.out.println(cnt);
    }
}
