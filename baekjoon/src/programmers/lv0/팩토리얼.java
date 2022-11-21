package programmers.lv0;

public class 팩토리얼 {
    public int solution(int n ) {
        int answer = 0;

        for(int i = 1; i <= 10; i++) {
            if(fac(i) <= n) {
                answer = i;
            }
        }
        return answer;
    }

    public int fac(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
