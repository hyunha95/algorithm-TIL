package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int[] intArr = new int[num];
        for (int i = 0; i < num; i++) {
            intArr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(intArr);

        System.out.println(arithmeticMean(intArr));
        System.out.println(medianValue(intArr));
        mode(intArr);
    }

    public static int arithmeticMean(int[] intArr) {
        int total = 0;
        for (int i = 0; i < intArr.length; i++) {
            total += intArr[i];
        }
        return total / intArr.length;
    }

    public static int medianValue(int[] intArr) {
        int midIndex = (int) Math.ceil(intArr.length / 2);
        return intArr[midIndex];
    }

    public static int mode(int[] intArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < intArr.length; i++) {
            map.put(intArr[i], intArr[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            if(map.containsKey(intArr[i])) {
                map.put(intArr[i], map.get(intArr[i]) + 1 - map.get(intArr[i]));
            }
        }

//        for(Map.Entry(String, String) entry : map.entrySet()) {
//
//        }
        return 0;
    }
}
