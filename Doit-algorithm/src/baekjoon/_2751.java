package baekjoon;

import java.io.*;
import java.util.*;

public class _2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        list.forEach((item) -> sb.append(item + "\n"));
        System.out.println(sb);
    }
}
