package Clase5;

public class MyStack {

	int idx = 0;
	char[] data = new char[6];

	public void push(char c) {
		data[idx] = c;
		idx++;
	}

	public char pop() { // pick on pile
		idx--;
		return data[idx];
	}
}
