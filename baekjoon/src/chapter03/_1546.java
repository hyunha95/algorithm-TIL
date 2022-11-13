package chapter03;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] avgArr = sc.nextLine().split(" ");
        double[] intArr = new double[avgArr.length];

        double max = 0;
        for (int i = 0; i < avgArr.length; i++) {
            intArr[i] = Integer.parseInt(avgArr[i]);
            max = Math.max(max, intArr[i]);
        }

        double total = 0;
        for (int i = 0; i < avgArr.length; i++) {
            total += (intArr[i] / max) * 100;
        }

        double answer = total / num;
        System.out.println(answer);
    }
}
