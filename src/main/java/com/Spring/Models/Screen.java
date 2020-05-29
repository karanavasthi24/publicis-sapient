package com.Spring.Models;

public class Screen {
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public Screen(int length, int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public String toString() {
		return "Screen [length=" + length + ", width=" + width + "]\n";
	}
	
	

}
