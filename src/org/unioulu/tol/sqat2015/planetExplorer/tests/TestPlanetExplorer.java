package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void testPlanetCreation() {
		Planet p = new Planet(100,100);
		assertEquals(100,p.getSizeX());
	}
}
