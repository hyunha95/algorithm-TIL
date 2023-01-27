package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == a[i%a.length]) scores[0]++;
            if(answers[i] == b[i%b.length]) scores[1]++;
            if(answers[i] == c[i%c.length]) scores[2]++;
        }

        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> list = new ArrayList<>();
        if(scores[0] == max) list.add(1);
        if(scores[1] == max) list.add(2);
        if(scores[2] == max) list.add(3);

        return list.stream().sorted().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 모의고사().solution(new int[] {1,3,2,4,2})));
    }
}
