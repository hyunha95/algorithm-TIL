package chapter03;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();

        char chArr[] = num2.toCharArray();

        int answer = 0;

        for (int i = 0; i < chArr.length; i++) {
            answer += chArr[i] - '0';
        }
        System.out.println(answer);
    }
}
