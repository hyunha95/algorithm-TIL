package baekjoon;

import java.util.Scanner;

public class 최소_공배수_구하기_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A * B / euclidean(A, B));
        }

    }
    public static int euclidean(int A, int B) {
       if(A % B == 0) {
           return B;
       }
       return euclidean(B, A % B);
    }
}
