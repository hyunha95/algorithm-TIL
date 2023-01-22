package baekjoon;

import java.util.Scanner;

public class 블랙잭_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 1 + i; j < A.length; j++) {
                for (int k = 1 + j; k < A.length; k++) {
                    int total = A[i] + A[j] + A[k];
                    if(total > max && total <= M) {
                        max = total;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
