package baekjoon;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int time = sc.nextInt();

        int hour = Integer.parseInt(strArr[0]);
        int minute = Integer.parseInt(strArr[1]);

        int totalMinute = minute + time;
        hour = hour + (totalMinute / 60);
        minute = totalMinute % 60;

        if(hour >= 24 || hour < 0) {
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute);
    }
}
