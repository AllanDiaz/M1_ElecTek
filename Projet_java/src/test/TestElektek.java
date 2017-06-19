package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Consomateur;
import model.Fournisseur;

public class TestElektek {


	@Test
	public void testGetNomConsommateur(){
		Consomateur c = new Consomateur("PASCAL","Jeremy");
		assertEquals("PASCAL", c.getNom());
	}
	@Test
	public void testGetPrenom(){
		Consomateur c = new Consomateur("PASCAL","Jeremy");
		assertEquals("Jeremy", c.getPrenom());
	}
	@Test
	public void testGetTarif(){
		Fournisseur f  = new Fournisseur("EDF",50);	
		assertEquals(50, f.getTarif());
	}
	@Test
	public void testGetNomFournisseur(){
		Fournisseur f  = new Fournisseur("EDF",50);	
		assertEquals("EDF", f.getNom());
	}
}
