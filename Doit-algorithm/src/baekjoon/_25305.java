package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        String[] strScores = br.readLine().split(" ");
        Integer[] scores = new Integer[strScores.length];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(strScores[i]);
        }
        List<Integer> list = Arrays.asList(scores);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(num2 - 1));

    }
}
