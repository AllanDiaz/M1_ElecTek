package model;

import ElecTek.Consummer;

public class Main {

	public static void main(String[] args) {
		
		Consomateur c = new Consomateur("PASCAL","Jeremy");
		Fournisseur f  = new Fournisseur("EDF");
		
		f.afficher();
		f.definirTarif(100);
		
		c.afficher();
		c.consulterConso();
		c.imprimerFacture();
		c.editerProfil();
		

	}

}	
