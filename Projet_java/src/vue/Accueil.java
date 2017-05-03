/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Accueil
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/vue/Accueil.java
*********************************************************************/

package vue;

import java.awt.Color;

import javax.swing.JFrame;

//----------------------------------------------------------------------------
// vue/Accueil.java                                                                  
//----------------------------------------------------------------------------

//## package vue 


//## class Accueil 
public class Accueil{
    
    protected choixFournisseur itsChoixFournisseur;		//## link itsChoixFournisseur 
    
    protected Consomation itsConsomation;		//## link itsConsomation 
    
    protected Facture itsFacture;		//## link itsFacture 
    
    public static void main(String args[]){
    	//Accueil ac = new Accueil();
    	Connexion c = new Connexion();
    }
    
    // Constructors
    
    //## auto_generated 
    public  Accueil() {
    	Connexion c = new Connexion();
    }
    
    //## auto_generated 
    public choixFournisseur getItsChoixFournisseur() {
        return itsChoixFournisseur;
    }
    
    //## auto_generated 
    public void setItsChoixFournisseur(choixFournisseur p_choixFournisseur) {
        itsChoixFournisseur = p_choixFournisseur;
    }
    
    //## auto_generated 
    public Consomation getItsConsomation() {
        return itsConsomation;
    }
    
    //## auto_generated 
    public void setItsConsomation(Consomation p_Consomation) {
        itsConsomation = p_Consomation;
    }
    
    //## auto_generated 
    public Facture getItsFacture() {
        return itsFacture;
    }
    
    //## auto_generated 
    public void setItsFacture(Facture p_Facture) {
        itsFacture = p_Facture;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/vue/Accueil.java
*********************************************************************/

