package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 알고리즘_수업_깊이_우선_탐색_2_24480 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int N, M, R;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        answer = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(graph[i], new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }

        DFS(R);
        for (int i = 1; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        answer[node] = ++count;
        for(int i : graph[node]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
