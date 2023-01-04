package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 친구_관계_파악하기_13023 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        int N;
        int M;
        arrive = false;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new ArrayList[N];
        visited = new boolean[N];
        for(int i = 0; i < N; i++){
            A[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for(int i = 0; i < N; i++) {
            DFS(i, 1);

            if(arrive)
                break;
        }
        System.out.println(arrive ? "1" : "0");
    }

    static void DFS(int now, int depth) {
        if(depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for(int i : A[now]) {
            if(!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
