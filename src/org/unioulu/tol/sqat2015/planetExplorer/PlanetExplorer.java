package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 108
// Finish time: 
public class PlanetExplorer {
	private int locationX = 0;
	private int locationY = 0;
	private int planetSizeX;
	private int planetSizeY;
	private String direction = "N";
	private int direction_id = 0;
	public int getdirection_id() {
		return direction_id;
	}

	public void setdirection_id(int direction_id) {
		this.direction_id = direction_id;
	}

	public String getdirection() {
		return direction;
	}

	public void setdirection(String direction) {
		this.direction = direction;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public PlanetExplorer(int x, int y, String obstacles){
		this.setPlanetSizeX(x);
		this.setPlanetSizeY(y);
		
		/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public int getPlanetSizeX() {
		return planetSizeX;
	}

	public void setPlanetSizeX(int planetSizeX) {
		this.planetSizeX = planetSizeX;
	}

	public int getPlanetSizeY() {
		return planetSizeY;
	}

	public void setPlanetSizeY(int planetSizeY) {
		this.planetSizeY = planetSizeY;
	}

	
	public String executeCommand(String command){
		List<String> directions = new ArrayList<String>();
		directions.add("N");
		directions.add("E");
		directions.add("S");
		directions.add("W");
		System.out.println("---");
		
		if(command.length() == 0){
			return "("+this.getLocationX()+","+this.getLocationY()+","+directions.get(this.getdirection_id())+")";
		}
		
		String[] command_arr = command.split("");
		for(int i = 1; i<command_arr.length; i++){
			
			
		if(command_arr[i] == "r"){
			int new_direction = ( this.getdirection_id() + 1 );
			this.setdirection_id(new_direction);
			System.out.println(this.getdirection_id());
			this.setdirection(directions.get(this.getdirection_id()));
		}
		
		
		}
		return "("+this.getLocationX()+","+this.getLocationY()+","+directions.get(this.getdirection_id())+")";
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		//return null;
	}
}
