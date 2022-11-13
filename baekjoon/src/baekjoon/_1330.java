package baekjoon;

import java.util.Scanner;

public class _1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        if(intArr[0] > intArr[1]) {
            System.out.println(">");
        } else if (intArr[0] < intArr[1]) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
