package baekjoon;

import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            String[] strArr = sc.nextLine().split(" ");
            int loopCount = Integer.parseInt(strArr[0]);
            char[] chArr = strArr[1].toCharArray();
            for (int j = 0; j < chArr.length; j++) {
                for (int k = 0; k < loopCount; k++) {
                    System.out.print(chArr[j] + "");
                }
            }
            System.out.println();
        }
    }
}
