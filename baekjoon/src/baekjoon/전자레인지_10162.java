package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 전자레인지_10162 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        int[] buttons = new int[] {300, 60, 10};
        int[] answer = new int[buttons.length];

        for (int i = 0; i < buttons.length; i++) {
            answer[i] = T / buttons[i];
            T = T % buttons[i];
        }

        if(T != 0) {
            System.out.println(-1);
        } else {
            System.out.println(String.join(" ", Arrays.stream(answer).mapToObj(String::valueOf).toArray(String[]::new)));
        }

    }
}
