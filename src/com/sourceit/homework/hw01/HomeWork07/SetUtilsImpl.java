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
        ArrayList <Integer> arrayNumbers = new ArrayList<>(collection);
        ArrayList <String> arrayWords = new ArrayList<>(set);
        final Map <Integer, String> wordPlusNumber = new TreeMap <> ();
        for (int i = 0; i < arrayNumbers.size(); i++ ){
            wordPlusNumber.put(arrayNumbers.get(i), arrayWords.get(i));
        }
        /*SortedSet<String> orderedSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }
        }); orderedSet.addAll(set);
        */
        Map<Integer, String> sortedMap = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        sortedMap.putAll(wordPlusNumber);

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.addAll(sortedMap.values());
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
