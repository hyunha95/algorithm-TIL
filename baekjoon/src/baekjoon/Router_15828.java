package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Router_15828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int M = 0;
        while((M = sc.nextInt()) != -1) {
            if(M > 0) {
                if(queue.size() != N) {
                    queue.offer(M);
                }
            } else {
                queue.poll();
            }
        }

        StringBuilder sb = new StringBuilder();
        if(queue.isEmpty()) {
            System.out.print("empty");
        } else {
            while(!queue.isEmpty()) {
                sb.append(queue.poll() + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
