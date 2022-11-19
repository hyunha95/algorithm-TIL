package programmers;

public class 문자열_뒤집기 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string);
        answer.reverse();

        return answer.toString();
    }
}
