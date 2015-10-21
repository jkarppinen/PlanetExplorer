package org.unioulu.tol.sqat2015.planetExplorer;

public class Planet {
	private int sizeX;
	private int sizeY;
	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	public Planet(int x, int y){
		this.setSizeX(x);
		this.setSizeY(y);
	}
}
