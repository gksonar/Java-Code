package Array;

import java.util.ArrayList;
import java.util.List;

public class SmallestandSecondSmallest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        // cheapest(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }

            }
        }
        int a = list.size();

        System.out.println(list.get(a - 1));
        System.out.println(list.get(a - 2));
    }
}
