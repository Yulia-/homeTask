package com.sourceit.homework.hw01.HomeWork07;

import com.sourceit.hometask.collections.ListUtils;

import java.util.*;

/**
 * Created by Юля on 10.03.2015.
 */
public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if (strings == null){
            throw  new IllegalArgumentException("String is empty");
        }
        List<String> asList = Arrays.asList(strings);
        return asList;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
        if (list == null){
            throw new IllegalArgumentException("List is empty");
        }

        List<T> sorted = new ArrayList<T>();
        sorted.addAll(list);
        Collections.sort(sorted, new Comparator<T>() {
            public int compare(T o1, T o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        return sorted;
    }
}
