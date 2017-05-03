package model;

public class Main {

	public static void main(String[] args) {
		
		Consomateur c = new Consomateur("PASCAL","Jeremy");
		Fournisseur f  = new Fournisseur("EDF",50);
		
		f.afficher();
		f.definirTarif(100);
		
		c.afficher();
		
		c.consulterConso();
		c.imprimerFacture();
		c.editerProfil();
		c.choisirFournisseur();
		
		c.afficher();
		

	}

}	
