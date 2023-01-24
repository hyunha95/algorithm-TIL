package baekjoon;

import java.util.Scanner;

public class 덩치_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] people = new int[N][2];
        int[] answer = new int[N];

        for(int i = 0; i < N; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        int rank = 0;
        for(int i = 0; i < people.length; i++) {
            for(int j = 0; j < people.length; j++) {
                if(i == j) {
                    continue;
                }
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            answer[i] = rank + 1;
            rank = 0;
        }

        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
