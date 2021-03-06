package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.ArrayList;
import java.util.List;


// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 108
// Finish time: 16:45
public class PlanetExplorer {
	private int locationX;
	private int locationY;
	private int planetSizeX;
	private int planetSizeY;
	private int position_id;
	
	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getPosition() {
		List<String> positions = new ArrayList<String>();
		positions.add("N");
		positions.add("E");
		positions.add("S");
		positions.add("W");
		
		return positions.get(this.getPosition_id());
		
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
		this.setLocationX(0);
		this.setLocationY(0);
		this.setPosition_id(0);
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
		List<String> positions = new ArrayList<String>();
		positions.add("N");
		positions.add("E");
		positions.add("S");
		positions.add("W");
		int new_position = 0;
		
		if(command.length() == 0){
			return "("+this.getLocationX()+","+this.getLocationY()+","+positions.get(this.getPosition_id())+")";
		}
		
		String[] command_arr = command.split("(?!^)");
		for(int i = 0; i < command_arr.length; i++){
			
			if(command_arr[i] == "f"){
				this.setLocationY(this.getLocationY() + 1);
			}
			//System.out.println(command + " " + command_arr[i] + " " + i);
			if(command_arr[i] == "r"){
				new_position = this.getPosition_id() + 1;
				this.setPosition_id(new_position);
			}

			System.out.println(command + command_arr.length + " " + new_position);
		
		}
		return "("+this.getLocationX()+","+this.getLocationY()+","+positions.get(this.getPosition_id())+")";
		
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
