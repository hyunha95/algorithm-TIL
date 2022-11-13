package baekjoon;

import java.util.*;
import java.util.stream.Collectors;

public class _18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        String[] strArr = sc.nextLine().split(" ");
        for (int i = 0; i < strArr.length; i++) {
            list.add(Integer.parseInt(strArr[i]));
        }
        List<Integer> answerList = new ArrayList<>(new LinkedHashSet<>(list.stream().sorted().collect(Collectors.toList())));

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < answerList.size(); i++) {
            map.put(answerList.get(i), i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(map.get(list.get(i)) + " ");
        }
    }
}
