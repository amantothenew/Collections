// Q1) Write Java code to define List. Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Float> floatList = new ArrayList<>();
        floatList.add(1.2f);
        floatList.add(3.4f);
        floatList.add(5.6f);
        floatList.add(7.8f);
        floatList.add(9.0f);

        float sum = 0;
        Iterator<Float> iterator = floatList.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        System.out.println("Sum = " + sum);
    }
}
