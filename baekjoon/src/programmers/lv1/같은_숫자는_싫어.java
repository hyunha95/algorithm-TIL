package programmers.lv1;
import java.util.*;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            int n = queue.poll();
            if(!queue.isEmpty() && n == queue.peek()) {
                continue;
            } else {
                list.add(n);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}