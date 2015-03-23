package com.sourceit.homework.hw01.HomeWork07;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Юля on 10.03.2015.
 */
public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> collection1, Collection<Integer> collection2) throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Collection is empty");
        }
        Collection<Integer> unionCall = new ArrayList<Integer>();
        unionCall.addAll(collection1);
        unionCall.addAll(collection2);

        return unionCall;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection1, Collection<Integer> collection2) throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Collection is empty");
        }
        Collection<Integer> interCall = new ArrayList<Integer>(collection1);
        interCall.retainAll(collection2);
        return interCall;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection1, Collection<Integer> collection2) throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Collection is empty");
        }
        Set<Integer> unionWithoutDuplic = new TreeSet<Integer>();
        unionWithoutDuplic.addAll(collection1);
        unionWithoutDuplic.addAll(collection2);

        return unionWithoutDuplic;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection1, Collection<Integer> collection2) throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Collection is empty");
        }
        Set<Integer> intersection = new TreeSet<Integer>();
        intersection.addAll(collection1);
        intersection.retainAll(collection2);
        return intersection;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection1, Collection<Integer> collection2) throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Collection is empty");
        }
        Collection<Integer> difference1 = new ArrayList<Integer>(collection1);
        difference1.removeAll(collection2);
        Collection<Integer> difference2 = new ArrayList<Integer>(collection2);
        difference2.removeAll(collection1);
        Collection<Integer> difference = new ArrayList<Integer>();
        difference.addAll(difference1);
        difference.addAll(difference2);

        return difference;
    }
}
