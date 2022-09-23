package baekjoon;

import java.util.*;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];
        String str = sc.next().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            int tempNum = str.charAt(i) - 65;
            alphabet[tempNum]++;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            } else if (alphabet[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
