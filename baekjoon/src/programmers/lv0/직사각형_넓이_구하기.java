package programmers.lv0;

import java.util.Arrays;
import java.util.Comparator;

public class 직사각형_넓이_구하기 {
    public int solution(int[][] dots) {
        int answer = 0;

        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        });

        int x = Math.abs(dots[0][0] - dots[3][0]);
        int y = Math.abs(dots[0][1] - dots[3][1]);

        answer = x * y;

        return answer;
    }
}
