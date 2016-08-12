package tools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class Pair<K, V> {
    private K key;
    private V value;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public List<Pair<K, V>> keysInValuesAmount(List<Pair<K, V>> list) {
        List<Pair<K, V>> result = new ArrayList<Pair<K, V>>();
        for (Pair<K, V> pair : list) {
            if (key == pair.getValue())
                result.add(pair);
        }
        return result;
    }

    public List<Pair<K, V>> valuesInKeysAmount(List<Pair<K, V>> list) {
        List<Pair<K, V>> result = new ArrayList<Pair<K, V>>();
        for (Pair<K, V> pair : list) {
            if (value == pair.getKey())
                result.add(pair);
        }
        return result;
    }

    public List<Pair<K, V>> keysAmount(List<Pair<K, V>> list) {
        List<Pair<K, V>> result = new ArrayList<Pair<K, V>>();
        for (Pair<K, V> pair : list) {
            if (key == pair.getKey())
                result.add(pair);
        }
        return result;
    }

    public List<Pair<K, V>> valuesAmount(List<Pair<K, V>> list) {
        List<Pair<K, V>> result = new ArrayList<Pair<K, V>>();
        for (Pair<K, V> pair : list) {
            if (value == pair.getValue())
                result.add(pair);
        }
        return result;
    }
}
