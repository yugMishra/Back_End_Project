package dataStructures;

import java.util.LinkedList;

public class HashTable<K,V> {
	private LinkedList<Entry<K,V>> [] buckets;
	private int size;
	private static final int DEFAULT_CAPACITY=10;
	
	public HashTable() {
		this(DEFAULT_CAPACITY);
	}
	public HashTable(int capacity) {
		this.buckets=new LinkedList[capacity];
		this.size=0;
	}
	
	private static class Entry<K,V>{
		K key;
		V value;
		public Entry(K key,V value) {
			this.key=key;
			this.value=value;
		}
	}
	//other methods
	//1. HashFn
	public int hashFunction(K key) {
		//int hashCode=key.hashCode();
		return Math.abs(key.hashCode()%buckets.length);
	}
	public void put(K key,V value) {
		int index=hashFunction(key);
		if(buckets[index]==null)
			buckets[index]=new LinkedList<Entry<K,V>>();
		//if key already exist in the LL
		for(Entry<K,V> entry:buckets[index]) {
			if(entry.key.equals(key)) {
				entry.value=value;
			return;
			}
		}
		//if key doesnt exist add new entry to LL;
		buckets[index].add(new Entry<>(key,value));
		size++;
	}
	
	public V get(K key) {
	    int index = hashFunction(key);
	    if (buckets[index] == null) {
	        return null; // Key not found
	    }

	    // Search for key in the linked list
	    for (Entry<K, V> entry : buckets[index]) {
	        if (entry.key.equals(key)) {
	            return entry.value; // Key found, return corresponding value
	        }
	    }

	    return null; // Key not found
	}

	public static void main(String[] args) {
		HashTable<Integer,Integer> hashTable=new HashTable<>();
		hashTable.put(11,11);
		hashTable.put(1700,17);
		hashTable.put(130,13);
		hashTable.put(110,111);
		hashTable.put(110,110);
		for(int i=0;i<hashTable.buckets.length;++i) {
			if (hashTable.buckets[i]!=null) {
			for(Entry<Integer,Integer>entry:hashTable.buckets[i])
				System.out.println("Key: "+entry.key+" Value: "+entry.value);
			}
		}
		System.out.println(hashTable.get(110));
	}
}

	
	


