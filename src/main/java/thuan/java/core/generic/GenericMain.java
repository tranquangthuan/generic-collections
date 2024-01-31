package thuan.java.core.generic;

public class GenericMain {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push("ABC");
		myStack.push(1);

//		Integer last = (Integer) myStack.pop();
//		System.out.println(last);

//		String last = (String) myStack.pop();
//		System.out.println(last);

		MyGenericStack<String> myGenericStack = new MyGenericStack<String>();
		myGenericStack.push("ABC");
		myGenericStack.push("XYZ");
		myGenericStack.push("EFH");

		// Can't push Other data type
		//myGenericStack.push(1);

		System.out.println(myGenericStack.pop());
		System.out.println(myGenericStack.pop());
		System.out.println(myGenericStack.pop());

	}

}
