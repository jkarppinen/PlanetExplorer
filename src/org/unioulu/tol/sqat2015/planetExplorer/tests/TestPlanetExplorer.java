package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;

public class TestPlanetExplorer {

	@Test
	public void testPlanetSize() {
		Planet p = new Planet(100,100);
		assertEquals(100,p.getSizeX());
	}
}
