package thuan.java.core.generic;

import java.util.Arrays;

public class MyGenericStack<E> {
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INIT_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public MyGenericStack() {
		elements = (E[]) new Object[DEFAULT_INIT_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size] = e;
		size++;
		System.out.println(size);
	}

	public E pop() {
		if (size == 0) {
			return null;
		}
		E result = elements[size - 1];
		size = size - 1;
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
