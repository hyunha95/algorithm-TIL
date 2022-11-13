package baekjoon;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int hour = Integer.parseInt(strArr[0]);
        int minute = Integer.parseInt(strArr[1]);

        minute -= 45;

        if(minute < 0) {
            hour -= 1;
            if(hour < 0) {
                hour += 24;
            }
            minute += 60;
        }

        System.out.println(hour + " " + minute);
    }
}
