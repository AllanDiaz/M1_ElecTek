/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Consomateur
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/model/Consomateur.java
*********************************************************************/

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//----------------------------------------------------------------------------
// model/Consomateur.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class Consomateur 
public class Consomateur {
    
    protected Fournisseur fournisseur;		//## attribute fournisseur 
    
    protected int id;		//## attribute id 
    
    protected String nom;		//## attribute nom 
    
    protected String prenom;		//## attribute prenom 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected Passerelle itsPasserelle_1;		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  Consomateur() {
    }
    
    public  Consomateur(String nom, String prenom) {
    	this.nom = nom;
    	this.prenom = prenom;
    }
    
    //## operation choisirFournisseur() 
    public void choisirFournisseur() {
        //#[ operation choisirFournisseur() 
        //#]
    	List<Fournisseur> maliste = new ArrayList();
    	maliste.add(new Fournisseur("EDF",50));
    	maliste.add(new Fournisseur("ENGIE",60));
    	maliste.add(new Fournisseur("ELEKTEK",40));
    	
    	System.out.println("veuillez choisir un fournisseur parmis cette liste en rentrant son numeros:");
    	int cpt = 0;
    	for ( Fournisseur fournisseur : maliste){
    		cpt ++;
    		System.out.print(cpt+" : ");
    		fournisseur.afficher();
    	}
    	
    	Scanner scanner = new Scanner(System.in);
    	String var = scanner.next();    	
    	
    	if(var.equals("1")){
    		this.setFournisseur(new Fournisseur("EDF",50));
    	}else if (var.equals("2")){
    		this.setFournisseur(new Fournisseur("ENGIE",60));
    	}else{
    		this.setFournisseur(new Fournisseur("ELEKTEK",40));
    	}
        //  prompt for the user's name       
        System.out.println("Votre fournisseur est maintenant : ");
        this.fournisseur.afficher();
    }
    
    //## operation consulterConso() 
    public void consulterConso() {
    	System.out.println("Votre facture est de 200e");
    	
    }
    
    //## operation editerProfil() 
    public void editerProfil() {
    	
    	// create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        //  prompt for the user's name
        System.out.print("Changez votre nom: ");

        // get their input as a String
        setNom(scanner.next());

        // prompt for their age
        System.out.print("Changez votre prenom: ");

        // get the age as an int
        setPrenom(scanner.next());

        System.out.println("Modification effecyué, votre nom est : "+this.nom+" et votre prenom est : " + this.prenom);
    }
    
    //## operation imprimerFacture() 
    public void imprimerFacture() {
    	System.out.println("Votre facture a été imprimé");
    }
    
    //## auto_generated 
    public Fournisseur getFournisseur() {
        return fournisseur;
    }
    
    //## auto_generated 
    public void setFournisseur(Fournisseur p_fournisseur) {
        fournisseur = p_fournisseur;
    }
    
    //## auto_generated 
    public int getId() {
        return id;
    }
    
    //## auto_generated 
    public void setId(int p_id) {
        id = p_id;
    }
    
    //## auto_generated 
    public String getNom() {
        return nom;
    }
    
    //## auto_generated 
    public void setNom(String p_nom) {
        nom = p_nom;
    }
    
    //## auto_generated 
    public String getPrenom() {
        return prenom;
    }
    
    //## auto_generated 
    public void setPrenom(String p_prenom) {
        prenom = p_prenom;
    }
    
    //## auto_generated 
    public Passerelle getItsPasserelle() {
        return itsPasserelle;
    }
    
    //## auto_generated 
    public void setItsPasserelle(Passerelle p_Passerelle) {
        itsPasserelle = p_Passerelle;
    }
    
    //## auto_generated 
    public Passerelle getItsPasserelle_1() {
        return itsPasserelle_1;
    }
    
    //## auto_generated 
    public void __setItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1 = p_Passerelle;
    }
    
    //## auto_generated 
    public void _setItsPasserelle_1(Passerelle p_Passerelle) {
        if(itsPasserelle_1 != null)
            {
                itsPasserelle_1._removeItsConsomateur(this);
            }
        __setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._addItsConsomateur(this);
            }
        _setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle_1() {
        itsPasserelle_1 = null;
    }
    
    public void afficher(){
    	System.out.println("Client : "+this.nom+" "+this.prenom);
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Consomateur.java
*********************************************************************/

