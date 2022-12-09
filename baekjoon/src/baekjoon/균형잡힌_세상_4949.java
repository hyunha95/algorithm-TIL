package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌_세상_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.nextLine();

            if(s.equals(".")) {
                break;
            }

            System.out.println(solve(s));
        }
    }

    private static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '['){
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
