package baekjoon;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char[] chArr = sc.nextLine().toCharArray();
            int totalScore = 0;
            int currentScore = 0;
            for (int j = 0; j < chArr.length; j++) {
                if(chArr[j] == 'O') {
                    currentScore += 1;
                } else {
                    currentScore = 0;
                }
                totalScore += currentScore;
            }
            sb.append(totalScore + "\n");
            totalScore = 0;
        }
        System.out.println(sb);
    }
}
