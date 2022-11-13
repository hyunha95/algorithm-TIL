package baekjoon;

import java.util.*;

public class _1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[] strArr = new String[num];

        for (int i = 0; i < num; i++) {
            strArr[i] = sc.nextLine();
        }

        Arrays.sort(strArr);

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        List<String> tempList = new ArrayList<>(Arrays.asList(strArr));
        Set<String> set = new LinkedHashSet<>(tempList);
        List<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
