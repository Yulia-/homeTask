package com.sourceit.homework.hw01.HomeWork07;

import com.sourceit.hometask.collections.MultiValueMap;

import java.util.*;


/**
 * Created by Юля on 10.03.2015.
 */
public class MultiValueMapImpl<K, V> implements MultiValueMap {
    private Map<K, List<V>> map = new HashMap<>();

    @Override
    public int getCountValues(Object key) {

        List count = map.get(key);
        return count.size();
    }

    @Override
    public Object get(Object key) {
        map.get(key);
        return null;
    }

    @Override
    public Iterator getIterator(Object key) {
        return map.get(key).iterator();
    }

    @Override
    public Object remove(Object key) {
        map.remove(key);
        return map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }


    @Override
    public Object put(Object key, Object value) {
        List list = new ArrayList();
        list.add(value);
        map.put(key, list);
        return map;
    }

    @Override
    public void putAll(Map m) {
    map.putAll(m);
    }

    @Override
    public void clear() {
    map.clear();
    }

    @Override
    public Set keySet() {
        return map.keySet();
    }

    @Override
    public Collection values() {
        return map.values();
    }

    @Override
    public Set<Entry<K, List<V>>> entrySet() {
        return map.entrySet();
    }
}


