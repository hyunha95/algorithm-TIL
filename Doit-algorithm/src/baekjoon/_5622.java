package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chArr = sc.nextLine().toCharArray();
        List<Character> _2 = Arrays.asList('A', 'B', 'C');
        List<Character> _3 = Arrays.asList('D', 'E', 'F');
        List<Character> _4 = Arrays.asList('G', 'H', 'I');
        List<Character> _5 = Arrays.asList('J', 'K', 'L');
        List<Character> _6 = Arrays.asList('M', 'N', 'O');
        List<Character> _7 = Arrays.asList('P', 'Q', 'R', 'S');
        List<Character> _8 = Arrays.asList('T', 'U', 'V');
        List<Character> _9 = Arrays.asList('W', 'X', 'Y', 'Z');

        int totalTime = 0;
        for (int i = 0; i < chArr.length; i++) {
            if(_2.contains(chArr[i])) {
                totalTime += 3;
            }
            if(_3.contains(chArr[i])) {
                totalTime += 4;
            }
            if(_4.contains(chArr[i])) {
                totalTime += 5;
            }
            if(_5.contains(chArr[i])) {
                totalTime += 6;
            }
            if(_6.contains(chArr[i])) {
                totalTime += 7;
            }
            if(_7.contains(chArr[i])) {
                totalTime += 8;
            }
            if(_8.contains(chArr[i])) {
                totalTime += 9;
            }
            if(_9.contains(chArr[i])) {
                totalTime +=10;
            }
        }
        System.out.println(totalTime);
    }
}
