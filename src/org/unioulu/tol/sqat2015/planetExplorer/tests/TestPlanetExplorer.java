package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {


	
	@Test
	public void initPlanetExplorerLocationX(){
		PlanetExplorer pe = new PlanetExplorer(100,100,"");
		assertEquals(0,pe.getLocationX());
	}
	
	@Test
	public void initPlanetExplorerLocationY(){
		PlanetExplorer pe = new PlanetExplorer(100,100,"");
		assertEquals(0,pe.getLocationY());
	}
	
	@Test
	public void getPlanetSizeX(){
		PlanetExplorer pe = new PlanetExplorer(100,100,"");
		assertEquals(100,pe.getPlanetSizeX());
		assertEquals(100,pe.getPlanetSizeY());
	}	

	@Test
	public void initEmptyExecuteCommand(){
		PlanetExplorer pe = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,N)",pe.executeCommand(""));
	}
	
	
	
}
