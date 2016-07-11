package com.zetaphase.javaArrays;

public interface Queue {
	
	public int take();
	
	public void add(int val);
	
	public void resize(int len);
}
