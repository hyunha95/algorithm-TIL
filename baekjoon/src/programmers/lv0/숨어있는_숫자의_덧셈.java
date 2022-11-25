package programmers.lv0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 숨어있는_숫자의_덧셈 {
    public int solution(String my_string) {
        int answer = 0;

        Pattern p = Pattern.compile("[0-9]", Pattern.MULTILINE);
        Matcher m = p.matcher(my_string);
        if(m.matches()) {
            return 0;
        }

        String[] strArr = my_string.split("[^0-9]");

        for(String str : strArr) {
            if(!"".equals(str))
                answer += Integer.parseInt(str);
        }

        return answer;
    }
}
