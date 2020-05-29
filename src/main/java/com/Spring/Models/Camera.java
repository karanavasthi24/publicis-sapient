package com.Spring.Models;

public class Camera {
	private int pixels;

	public int getpixels() {
		return pixels;
	}

	public void setpixels(int pixels) {
		this.pixels = pixels;
	}

	public Camera(int pixels) {
		this.pixels = pixels;
	}

	@Override
	public String toString() {
		return "Camera [pixels=" + pixels + "]\n";
	}
	


}
