package module1.task1;

public class MyHashSet<K> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;

    private static class Node<K> {
        final int hash;
        final K key;
        Node<K> next;

        Node (int hash, K key, Node<K> next) {
            this.hash = hash;
            this.key = key;
            this.next = next;
        }

        public K getKey() {
            return key;
        }
    }

    static final int hash(Object key) {
        int h = (key == null) ? 0 : (key.hashCode() * 7);
        return h ^ (h  >>> 16);
    }

    Node<K>[] table;

    public MyHashSet() {
        table = new Node[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    final int getIndex(int hash) {
        return hash & (table.length - 1);
    }

    public void put(K key) {
        int hash = hash(key);
        int index = getIndex(hash);
        Node<K> node = table[index];
        Node<K> newNode;

        while (node != null) {

            if (hash == node.hash && node.key.equals(key)) {
                return;
            }
            node = node.next;
        }

        newNode = new Node<>(hash, key, table[index]);

        table[index] = newNode;
        size++;
    }

    public void remove(K kye) {
        int hash = hash(kye);
        int index = getIndex(hash);
        Node<K> node = table[index];
        Node<K> nodePred = null;

        while (node != null) {
            if (node.hash == hash && kye.equals(node.key)) {
                if (nodePred == null) {
                    table[index] = node.next;

                } else {
                    nodePred.next = node.next;
                }
                size--;
                return;
            }
            nodePred = node;
            node = node.next;
        }
    }

    public int getSize() {
        return this.size;
    }
}
