package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 로프_2217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        Arrays.sort(A);

        int maxWeight = 0;
        int mulitplyNum = 1;
        for (int i = N - 1; i >= 0; i--) {
            int result = A[i] * mulitplyNum++;
            maxWeight = result > maxWeight ? result : maxWeight;
        }

        System.out.println(maxWeight);
    }
}
