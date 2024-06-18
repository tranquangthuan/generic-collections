package thuan.java.core.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapAndLinkedHashMap {
	public static void main(String[] args) {
		//hashMap();
		System.out.println("----------");
		linkedHashMap();
	}

	private static void hashMap() {
		// Hashmap không keep order của thứ tự insert
		// HashMap cho phép 1 null key
		// HashMap chỉ giữ lại 1 key nếu trùng key, giá trị của key cuối cùng sẽ được
		// ghi đè
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("100", "ABC");
		hashMap.put("2", "XYZ");
		hashMap.put("1", "111");
		hashMap.put("5", "555");
		hashMap.put("7", "Z7");
		hashMap.put(null, "NULL VALUE");
		hashMap.put(null, "NULL VALUE 2");
		hashMap.put("7", "Z7 Override");

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key = " + key + ", Value = " + val);
		}
	}

	private static void linkedHashMap() {
		// LinkedHashMap keep order của thứ tự insert
		// HashMap cho phép 1 null key
		// HashMap chỉ giữ lại 1 key nếu trùng key, giá trị của key cuối cùng sẽ được
		// ghi đè
		Map<String, String> hashMap = new LinkedHashMap<String, String>();
		hashMap.put("100", "ABC");
		hashMap.put("2", "XYZ");
		hashMap.put("1", "111");
		hashMap.put("5", "555");
		hashMap.put("7", "Z7");
		hashMap.put(null, "NULL VALUE");
		hashMap.put(null, "NULL VALUE 2");
		hashMap.put("7", "Z7 Override");

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key = " + key + ", Value = " + val);
		}
	}
}
