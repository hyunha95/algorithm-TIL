package search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public boolean searchFunc(ArrayList<Integer> dataList, Integer searchItem) {
        if(dataList.size() == 1 && dataList.get(0) == searchItem) {
            return true;
        }
        if(dataList.size() == 1 && dataList.get(0) != searchItem) {
            return false;
        }
        if(dataList.size() == 0) {
            return false;
        }

        int middle = dataList.size() / 2;

        if(searchItem == dataList.get(middle)) {
            return true;
        } else {
            if(dataList.get(middle) < searchItem) {
                return searchFunc(new ArrayList<Integer>(dataList.subList(middle, dataList.size())), searchItem);
            } else {
                return searchFunc(new ArrayList<>(dataList.subList(0, middle)), searchItem);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add((int)(Math.random() * 100) + 1);
        }
        Collections.sort(dataList);
        System.out.println(dataList);
        System.out.println(binarySearch.searchFunc(dataList, 10));
    }
}
