package com.zetaphase.javaArrays;

public class QueueArray implements Queue {

	private int[] array = new int[10];
	private int length = 0;
	
	@Override
	public void resize(int len) {
		int[] temp = new int[len];
		for (int i=0; i < array.length; i++){
			temp[i] = array[i];
		}
		
		array = temp;	
	}
	
	@Override
	public int take() {
		if (length < array.length / 2.0){
			this.resize((array.length / 2)+1);
		}
		int result = array[0];
		this.shift();
		length -= 1;
		return result;
	}

	@Override
	public void add(int val) {
		if (length == array.length){
			this.resize(array.length * 2);
		}
		array[length] = val;
		length += 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	//helper method
	public void shift() {
		// TODO Auto-generated method stub
		int[] temp = new int[array.length];
		for (int i=1; i < length; i++){
			temp[i-1] = array[i];
		}
		array = temp;
	}

}
