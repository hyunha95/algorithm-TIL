package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 특정_거리의_도시_찾기_18352 {
    static ArrayList<Integer>[] A;
    static int[] visited;
    static int N, M, K, X;
    static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visited = new int[N + 1];
        answer = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
            visited[i] = -1;
        }
        for(int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
        }
        BFS(X);
        for(int i = 1; i <= N; i++) {
            if(visited[i] == K) {
                answer.add(i);
            }
        }

        if(answer.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(answer);
            for(int i : answer) {
                System.out.println(i);
            }
        }
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node]++;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            for(int i : A[currentNode]) {
                if(visited[i] == -1) {
                    visited[i] = visited[currentNode] + 1;
                    queue.offer(i);
                }
            }
        }

    }
}










