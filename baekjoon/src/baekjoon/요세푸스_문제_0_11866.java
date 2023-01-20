package baekjoon;

import java.util.*;

public class 요세푸스_문제_0_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        List<String> answer = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while(answer.size() != N) {
            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            answer.add(String.valueOf(queue.poll()));
        }
        System.out.println("<" + String.join(", ", answer) + ">");
    }
}
