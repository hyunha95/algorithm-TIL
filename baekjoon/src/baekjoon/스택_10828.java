package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Stack<String> stack = new Stack<>();

        String[] A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = bf.readLine();
            if(A[i].contains(" ")) { // push
                String[] S =  A[i].split(" ");
                stack.push(S[1]);
            } else if("top".equals(A[i])) {
                if(stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if("size".equals(A[i])) {
                System.out.println(stack.size());
            } else if("empty".equals(A[i])) {
                System.out.println(stack.isEmpty() ? "1" : "0");
            } else if("pop".equals(A[i])) {
                if(stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
        bf.close();
    }
}
