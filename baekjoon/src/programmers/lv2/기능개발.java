package programmers.lv2;

import java.util.*;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(days);
        }

        while(!queue.isEmpty()) {
            int count = 1;
            int now = queue.poll();

            while(!queue.isEmpty()) {
                int next = queue.peek();
                if(now >= next) {
                    count++;
                    queue.poll();
                } else {
                    break;
                }
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 기능개발().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
//        [0, 1], [2, 5], [3, 9]
    }
}
