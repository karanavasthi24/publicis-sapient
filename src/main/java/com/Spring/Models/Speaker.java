package com.Spring.Models;

public class Speaker {
	
	private int volume;
	private String type;
	public int getvolume() {
		return volume;
	}
	public void setvolume(int volume) {
		this.volume = volume;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public Speaker(int volume, String type) {
		this.volume = volume;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Speaker [volume=" + volume + ", type=" + type + "]\n";
	}

}
