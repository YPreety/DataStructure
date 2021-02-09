package StackProgramming;

/*Time Complexity: O(n) where n is number of characters in stack.
Auxiliary Space: O(n) for stack.*/

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("GeeksforGeeks");
		reverse(s);
		System.out.println("Reversed string is : " + s);
	}

	public static void reverse(StringBuffer str) {
		int n = str.length();
		Stack obj = new Stack(n);

		// Push all characters of string to stack
		int i;
		for (i = 0; i < n; i++)
			obj.push(str.charAt(i));

		// Pop all characters of string and put them back to str
		for (i = 0; i < n; i++) {
			char ch = obj.pop();
			str.setCharAt(i, ch);
		}
	}

}

class Stack {
	int size;
	int top;
	char[] a;

	// function to check if stack is empty
	boolean isEmpty() {
		return (top < 0);
	}

	Stack(int n) {
		top = -1;
		size = n;
		a = new char[size];
	}

	// function to push element in Stack
	boolean push(char x) {
		if (top >= size) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			return true;
		}
	}

	// function to pop element from stack
	char pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			char x = a[top--];
			return x;
		}
	}
}
