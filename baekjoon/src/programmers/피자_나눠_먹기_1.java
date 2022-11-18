package programmers;

public class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= Math.ceil((double)n/7); i++) {
            answer = i;
        }

        return answer;
    }
}
