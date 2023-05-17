package SandyYudhaAlvyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Soal_A {
    public static void main(String[] args) {
        Object[] array = {12, 9, 30, "A", "M", 99, 82, "J", "N", "B"};

        List<Object> alphabetList = new ArrayList<>();
        List<Object> numberList = new ArrayList<>();

        for (Object element : array) {
            if (element instanceof String) {
                alphabetList.add(element);
            } else if (element instanceof Integer) {
                numberList.add(element);
            }
        }

        Collections.sort(alphabetList, Comparator.comparing(Object::toString));
        Collections.sort(numberList, Comparator.comparing(Object::toString));

        alphabetList.addAll(numberList);
        Object[] sortedArray = alphabetList.toArray();

        for (Object element : sortedArray) {
            System.out.print(element + " ");
        }
    }
}

