package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n != 0) {
                stack.push(n);
            } else {
                stack.pop();
            }
        }
        int answer = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.println(answer);
    }
}
