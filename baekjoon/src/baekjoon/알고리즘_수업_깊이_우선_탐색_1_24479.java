package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 알고리즘_수업_깊이_우선_탐색_1_24479 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    static int[] answer;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 노드 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        answer = new int[N + 1];
        for(int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for(int i = 1; i < M + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }

        for (int i = 1; i < N + 1; i++) {
            Collections.sort(A[i]);
        }
        DFS(R);
        for(int i = 1; i < N + 1; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void DFS(int node) {
        if(visited[node]) {
            return;
        }

        answer[node] = ++cnt;

        visited[node] = true;
        for(int i : A[node]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
