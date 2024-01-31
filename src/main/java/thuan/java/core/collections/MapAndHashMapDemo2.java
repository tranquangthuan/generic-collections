package thuan.java.core.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public class MapAndHashMapDemo2 {

	public static void main(String[] args) {
		System.out.println("------Hash Map with no order--");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("2B", 2);
		map.put("3AAA", 3);
		map.put("1A", 1);
		map.put("5CCC", 5);
		map.put("6DDD", 6);
		map.put("X7", 7);
		map.put("F4", 4);
		map.forEach((k, v) -> System.out.println("key =" + k + " Value = " + v));

		System.out.println("------Tree Map with order--");
		Map<String, Integer> map2 = new TreeMap<String, Integer>();
		map2.put("2B", 2);
		map2.put("3AAA", 3);
		map2.put("1A", 1);
		map2.put("5CCC", 5);
		map2.put("6DDD", 6);
		map2.put("X7", 7);
		map2.put("F4", 4);
		map2.forEach((k, v) -> System.out.println("key =" + k + " Value = " + v));

		Integer value = map2.remove("F4");
		System.out.println(value);
		map2.forEach((k, v) -> System.out.println("key =" + k + " Value = " + v));
		Set<String> keySet = map2.keySet();
		System.out.println(keySet);
		keySet.forEach(k -> System.out.println(map2.get(k)));

		boolean containsKey = map2.containsKey("F4");
		System.out.println(containsKey);
		Function<String, Integer> mappingFunction = k -> 100;
		Integer apply = mappingFunction.apply("ABC12121");
		System.out.println(apply);

		map2.computeIfAbsent("F222", mappingFunction);
		keySet.forEach(k -> System.out.println(map2.get(k)));
	}

}
