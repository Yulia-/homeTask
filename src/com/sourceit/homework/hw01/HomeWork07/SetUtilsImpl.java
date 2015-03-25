package com.sourceit.homework.hw01.HomeWork07;
import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Юля on 10.03.2015.
 */
public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {
        if (collection == null || set == null) {
            throw new NullPointerException("Collection or set is empty");
        }
        final ArrayList <Integer> arrayNumbers = new ArrayList<>(collection);
        final ArrayList <String> arrayWords = new ArrayList<>(set);

        SortedSet<String> sortedSet = new TreeSet<>(new Comparator<String> () {
            @Override
            public int compare (String o1, String o2) {
                if (arrayNumbers.get(arrayWords.indexOf(o1)) > arrayNumbers.get(arrayWords.indexOf(o2))) {
                    return 1;
                } else
                    return -1;
            }
            });
        sortedSet.addAll(arrayWords);

        return sortedSet;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... args) throws NullPointerException {
    if (args == null){
        throw new NullPointerException("No arguments");
    }
        Set<Integer> orderedSet = new LinkedHashSet<>();
        for (int i = 0; i<args.length; i++){
            orderedSet.add(args[i]);
        }
        return orderedSet;
    }
}
