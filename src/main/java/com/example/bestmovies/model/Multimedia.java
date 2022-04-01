package com.example.bestmovies.model;

public class Multimedia{
	
	private String type;
	private String src;
	private int height;
	private int width;
	private Results result;
	
	public Multimedia(String type, String src, int height, int width, Results result) {
		this.type = type;
		this.src = src;
		this.height = height;
		this.width = width;
		this.result = result;
	}
	
	public Results getResult() {
		return result;
	}


	public void setResult(Results result) {
		this.result = result;
	}


	public Multimedia() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Multimedia [type=" + type + ", src=" + src + ", height=" + height + ", width=" + width + "]";
	}
}
