package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Collections;
import java.util.StringTokenizer;

public class 유기농_배추_1012 {

    // 상, 하, 좌, 우
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] cabbages;
    static boolean[][] visited;

    static int count;

    static int M, N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            cabbages = new int[M][N];
            visited = new boolean[M][N];
            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                cabbages[X][Y] = 1;
            }

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(!visited[j][k] && cabbages[j][k] == 1) {
                        DFS(j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void DFS(int j, int k) {
        visited[j][k] = true;

        for (int i = 0; i < 4; i++) {
            int x = j + dx[i];
            int y = k + dy[i];
            if(x >= 0 && y >= 0 && x < M && y < N) {
                if(!visited[x][y] && cabbages[x][y] == 1) {
                    DFS(x, y);
                }
            }
        }
    }
}
