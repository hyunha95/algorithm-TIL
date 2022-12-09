package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            System.out.println(solve(bf.readLine()));

        }
    }

    private static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if(c == '(') {
                stack.push('(');
            } else if(stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
}
