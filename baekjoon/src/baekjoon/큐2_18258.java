package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 큐2_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        Deque<String> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String command = bf.readLine();
            if(command.contains(" ")) {
                String[] strArr = command.split(" ");
                queue.addLast(strArr[1]);
            } else if("pop".equals(command)) {
                sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append("\n");
            } else if("size".equals(command)) {
                sb.append(queue.size()).append("\n");
            } else if("empty".equals(command)){
                sb.append(queue.isEmpty() ? "1" : "0").append("\n");
            } else if("front".equals(command)) {
                sb.append(queue.isEmpty() ? "-1" : queue.peekFirst()).append("\n");
            } else if("back".equals(command)) {
                sb.append(queue.isEmpty() ? "-1" : queue.peekLast()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
