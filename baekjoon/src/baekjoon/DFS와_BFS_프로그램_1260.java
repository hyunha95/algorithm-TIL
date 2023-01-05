package baekjoon;

import java.util.*;

public class DFS와_BFS_프로그램_1260 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        A = new ArrayList[N + 1];
        for(int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            A[a].add(b);
            A[b].add(a);
        }
        for(int i = 1; i < N + 1; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);
    }

    static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");
            for(int i : A[currentNode]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
    static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;
        for(int i : A[node]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
