package com.sourceit.homework.hw01.HomeWork07;

import java.util.*;

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
        System.out.println();

        CollectionUtilsImpl operation = new CollectionUtilsImpl();
        Collection<Integer> collection1 = Arrays.asList(8, 2, 7, 4, 5);
        Collection<Integer> collection2 = Arrays.asList(8, 2, 4, 1, 5, 6);
        System.out.println(operation.union(collection1, collection2));
        System.out.println(operation.intersection(collection1, collection2));
        System.out.println(operation.unionWithoutDuplicates(collection1,collection2));
        System.out.println((operation.intersectionWithoutDuplicates(collection1, collection2)));
        System.out.println(operation.difference(collection1, collection2));
        System.out.println();

        SetUtilsImpl operationSet = new SetUtilsImpl();
        Collection<Integer> collection = Arrays.asList(1, 4, 8, 2);
        Set<String> set = new TreeSet<String>();
        set.add("d");
        set.add("a");
        set.add("m");
        set.add("k");
        System.out.println(collection);
        System.out.println(set);
        System.out.println(operationSet.orderedSet(collection, set));


        Integer arg1 = 2, arg2 = 6, arg3 = 9;
        System.out.println(operationSet.customOrderSet(arg1, arg2, arg3));

        MultiValueMapImpl multiMap = new MultiValueMapImpl();
        multiMap.put(5, "laptop");
        multiMap.put(5, "cell phone");
        multiMap.put(5, "iPad");
        multiMap.put(3, "perfume");
        multiMap.put(3, "rouge");
        multiMap.put(3, "nail polish");
        multiMap.put(4, "screwdriver");
        multiMap.put(4, "hammer");
        multiMap.put(1, "book");
        System.out.println(multiMap);
        System.out.println(multiMap.size());
        System.out.println(multiMap.getCountValues(1));
        System.out.println(multiMap.containsValue("book"));

    }


}
