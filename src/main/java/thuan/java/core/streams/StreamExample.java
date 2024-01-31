package thuan.java.core.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
		numbers.forEach(null);
		withStream(numbers);
		withoutStream(numbers);
	}

	public static void withoutStream(List<Integer> numbers) {
		long count = 0;
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				count++;
			}
		}
		System.out.println("So phan tu chan la " + count);
	}

	public static void withStream(List<Integer> numbers) {
		long count = numbers.stream().filter(num -> num % 2 == 0).count();
		System.out.println("So phan tu chan la " + count);
	}

}
