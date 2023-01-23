package baekjoon;

import java.util.Scanner;

public class 분해합_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean flag = true;
        for(int i = 1; i <= 1000000; i++) {
            String stringNumber = String.valueOf(i);
            int sum = i;
            for(int j = 0; j < stringNumber.length(); j++) {
                sum += Integer.parseInt(stringNumber.charAt(j) + "");
            }
            if(sum == N && i < N) {
                System.out.println(i);
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println(0);
        }
    }
}
