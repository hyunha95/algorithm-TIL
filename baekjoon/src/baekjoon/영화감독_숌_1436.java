package baekjoon;

import java.util.Scanner;

public class 영화감독_숌_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int deathNumber = 666;
        while(N != count) {
            deathNumber++;

            if(String.valueOf(deathNumber).contains("666")) {
                count++;
            }
        }
        System.out.println(deathNumber);
    }
}
