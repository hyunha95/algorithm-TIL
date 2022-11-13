package baekjoon;

import java.util.*;

public class _1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[N];

        for (int i = 0; i < N; i++) {
            strings[i] = sc.nextLine();
        }

        StringBuilder sb = new StringBuilder();
        boolean isSame = false;
        for (int i = 0; i < strings[0].length(); i++) {
            char c= strings[0].charAt(i);

            isSame = true;
            for (int j = 1; j < N; j++) {
                if(c != strings[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            if(isSame == true) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb.toString());
    }
}
