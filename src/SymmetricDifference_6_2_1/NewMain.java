package SymmetricDifference_6_2_1;

import java.util.*;

public class NewMain {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        Set<T> setResult = new HashSet<>(set1);
        setResult.addAll(set2);
        setResult.removeAll(setIntersection);
        return setResult;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {0, 1, 2};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> set3 = symmetricDifference(set1, set2);

        System.out.println(set3.toString());


    }
}
