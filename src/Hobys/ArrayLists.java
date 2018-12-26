package Hobys;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add(12);
        list.add(56);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(Arrays.binarySearch(list.toArray(), 12));
    }
}
