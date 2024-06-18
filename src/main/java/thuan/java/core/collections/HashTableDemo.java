package thuan.java.core.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		hashTable1();
	}

	private static void hashTable1() {
		Map<String, Integer> hashtable = new Hashtable<String, Integer>();
		// Thêm các cặp khóa-giá trị vào HashTable
		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Three", 3);
		// Error NullPointerException
		// hashtable.put("four", null);

		// Truy xuất một giá trị
		System.out.println("Value for 'One': " + hashtable.get("One"));

		// In tất cả các cặp khóa-giá trị
		System.out.println("Tất cả phần tử trongHashTable:");
		for (String key : hashtable.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}

		// Kiểm tra sự tồn tại của một khóa
		if (hashtable.containsKey("Two")) {
			System.out.println("HashTable contains 'Two'");
		}

		// Xóa một cặp khóa-giá trị
		hashtable.remove("Three");
		System.out.println("Sau khi removing 'Three':");
		for (String key : hashtable.keySet()) {
			System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
		}
	}

}
