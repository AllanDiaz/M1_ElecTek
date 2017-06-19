package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import com.itextpdf.text.log.SysoCounter;

import vue.Facture;


public class Main {

	static int  conso = 0;

	public static void main(String[] args) {
		
		
		
		Consomateur c = new Consomateur("PASCAL","Jeremy");
		Fournisseur f  = new Fournisseur("EDF",50);
		
		c.setFournisseur(f);
		Scanner scanner = new Scanner(System.in);
		String commande ="";
		List<String> maliste = new ArrayList();
    	maliste.add("1 : Editer profil");
    	maliste.add("2 : Choisir Fournisseur");
    	maliste.add("3 : Afficher votre profil");
    	maliste.add("4 : Afficher votre fournisseur");
    	maliste.add("5 : Afficher consomation");
    	maliste.add("6 : Telecharger facture");
    	maliste.add("q : Quitter");
		 long temps = 2000;                      
		 long startTime = 0;                    
		 Timer timer = new Timer();             
		 TimerTask tache = new TimerTask() {     
		     @Override
		         public void run() {
		             Main.conso+=10;
		         }
		 };
		 timer.scheduleAtFixedRate(tache,startTime,temps);  // ici on lance la mecanique
	
		while(commande != "q"){
			System.out.println("");
			System.out.println("Que voulez-vous faire ?");
	    	System.out.println("");
	    	for ( String maCommande : maliste){
	    		System.out.println(maCommande);;
	    	}
	    	switch (scanner.next()) {
			case "1":	
				c.editerProfil();
				break;
			case "2":	
				c.choisirFournisseur();
				break;
			case "3":
				c.afficher();
				break;
			case "4":
				c.getFournisseur().afficher();
				break;
			case "5":	
				System.out.println("Votre consomation est de "+conso+"kw");
				break;
			case "6":	
				Facture fa = new Facture(c,conso);
				fa.imprimer();
				System.out.println("Votre facture est disponnible dans le dossier : '//qnap/home/Documents/facture/facture.pdf'");
				break;
			case "q":
				commande = "q";
				break;
			default:
				System.out.println("Commande inconnue");
				break;
			}
			
		}
		System.out.println("Au revoir !");
		timer.cancel();
		timer.purge();
	}
}	
