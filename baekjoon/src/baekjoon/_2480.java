package baekjoon;

import java.util.*;

public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);
        int num3 = Integer.parseInt(strArr[2]);

        if(num1 == num2 && num2 == num3 && num3 == num1) {
            System.out.println(10000 + num1 * 1000);
        } else if(num1 != num2 && num2 != num3 && num3 != num1) {
            int max = 0;
            for (int i = 0; i < strArr.length; i++) {
                max = Math.max(max, Integer.parseInt(strArr[i]));
            }
            System.out.println(max * 100);
        } else {
            Integer[] numArr = {num1, num2, num3};
            List<Integer> list = Arrays.asList(numArr);
            Collections.sort(list);
            System.out.println(1000 + list.get(1) * 100);
        }
    }
}
