package programmers.lv0;

public class 외계어_사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i = 0; i < dic.length; i++) {
            if(dic[i].length() == spell.length) {
                for(int j = 0; j < spell.length; j++) {
                    dic[i] = dic[i].replaceFirst(spell[j], "");
                }
            }
            if(dic[i].length() == 0) {
                answer = 1;
            }
        }
        return answer;
    }
}
