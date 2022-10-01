package baekjoon;

import java.io.*;
import java.util.Arrays;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] intArr = new int[num];
        for (int i = 0; i < num; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i] + "\n");
        }
        System.out.println(sb);
    }
}
