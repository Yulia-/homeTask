package com.sourceit.homework.hw01.HomeWork07;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Юля on 10.03.2015.
 */
public class Test {
    public static void main (String [] args){
        ListUtilsImpl list = new ListUtilsImpl();
        List<String> strings = list.asList("lemon", "orange", "cherry", "mango");
        System.out.println(strings);

        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 3, 0, 8, 5);
        System.out.println(list.sortedList(numbers));

        CollectionUtilsImpl operation = new CollectionUtilsImpl();
        Collection<Integer> collection1 = Arrays.asList(8, 2, 7, 4, 5);
        Collection<Integer> collection2 = Arrays.asList(8, 2, 4, 1, 5, 6);
        System.out.println(operation.union(collection1, collection2));
        System.out.println(operation.intersection(collection1, collection1));
        System.out.println(operation.unionWithoutDuplicates(collection1,collection2));
        System.out.println((operation.intersectionWithoutDuplicates(collection1, collection2)));

    }


}
