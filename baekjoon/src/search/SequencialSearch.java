package search;

import java.util.ArrayList;

public class SequencialSearch {
    public Integer searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        for (int i = 0; i < dataList.size(); i++) {
            if(dataList.get(i) == searchItem) {
                return dataList.get(i);
            }
        }
        return -1;
    }
}
