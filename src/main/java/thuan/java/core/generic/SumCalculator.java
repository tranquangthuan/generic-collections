package thuan.java.core.generic;

import java.util.List;

public class SumCalculator {
	public static <T extends Number> void sum(List<T> numbers) {
		double sum = 0;
		for (T number : numbers) {
			sum += number.doubleValue();
		}
		System.out.println("Sum = " + sum);
	}

	public static void sum2(List<? extends Number> numbers) {
		double sum = 0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		System.out.println("Sum = " + sum);
	}

	public static <T> void print(List<T> numbers) {
		for (T t : numbers) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3);
		List<Double> doubles = List.of(2.0, 1.5);
		sum(integers);
		sum(doubles);
		sum2(integers);
		sum2(doubles);
		List<String> strings = List.of("A", "B", "C");
		// Compiler error
		// calculateNumberSum(strings);

		print(strings);
	}
}
