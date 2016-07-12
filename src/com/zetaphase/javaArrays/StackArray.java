package com.zetaphase.javaArrays;

import java.util.Arrays;

public class StackArray implements Stack {

	private int[] array = new int[10];
	private int length = 0;

	
	@Override
	//helper method
	public void resize(int len) {
		int[] temp = new int[len];
		for (int i=0; i < length; i++){
			temp[i] = array[i];
		}
		
		array = temp;	
	}
	
	@Override
	public int pop() {
		if (length < array.length / 2.0){
			this.resize((array.length / 2)+1);
		}
		int result = array[length-1];
		array[length-1] = 0;
		length -= 1;
		return result;
	}

	@Override
	public void push(int val) {
		if (length == array.length){
			this.resize(array.length * 2);
		}
		array[length] = val;
		length += 1;
	}

	public int getLength() {
		return length;
	}
	
	public int getArrayLength() {
		return array.length;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	public static void main(String[] args) {
		StackArray a = new StackArray();
		a.push(5);
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
		a.push(-10);
	}

}
