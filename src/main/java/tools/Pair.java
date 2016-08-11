package tools;

/**
 * Created by Evgenii_Nemich on 8/10/2016.
 */
public class Pair <K, V> {
    private K key;
    private V value;

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
}
