package thuan.java.core.generic;

import java.util.Arrays;

public class MyStack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INIT_CAPACITY = 16;

	public MyStack() {
		elements = new Object[DEFAULT_INIT_CAPACITY];
	}

	public void push(Object object) {
		ensureCapacity();
		elements[size] = object;
		size++;
	}

	public Object pop() {
		if (size == 0) {
			return null;
		}
		Object result = elements[size - 1];
		--size;
		elements[size] = null;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}

}
