package com.zetaphase.javaArrays;

public class StackArray implements Stack {

	private int[] array = new int[10];
	private int length = 0;

	
	@Override
	//helper method
	public void resize(int len) {
		int[] temp = new int[len];
		for (int i=0; i < array.length; i++){
			temp[i] = array[i];
		}
		
		array = temp;	
	}
	
	@Override
	public int pop() {
		if (length < array.length / 2.0){
			this.resize((array.length / 2)+1);
		}
		int result = array[length];
		array[length] = 0;
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

	public static void main(String[] args) {
		//StackArray a = new StackArray();
		//System.out.println(a.get(0).equals(null));
	}

}
