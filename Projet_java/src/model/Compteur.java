/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Compteur
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/model/Compteur.java
*********************************************************************/

package model;

//## link itsControleurConsommateur 
import controleur.ControleurConsommateur;

//----------------------------------------------------------------------------
// model/Compteur.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class Compteur 
public class Compteur {
    
    protected int consomation;		//## attribute consomation 
    
    protected boolean led_etat;		//## attribute led_etat 
    
    protected boolean led_status;		//## attribute led_status 
    
    protected int montant;		//## attribute montant 
    
    protected ControleurConsommateur itsControleurConsommateur;		//## link itsControleurConsommateur 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected Passerelle itsPasserelle_1;		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  Compteur() {
    }
    
    //## auto_generated 
    public int getConsomation() {
        return consomation;
    }
    
    //## auto_generated 
    public void setConsomation(int p_consomation) {
        consomation = p_consomation;
    }
    
    //## auto_generated 
    public boolean getLed_etat() {
        return led_etat;
    }
    
    //## auto_generated 
    public void setLed_etat(boolean p_led_etat) {
        led_etat = p_led_etat;
    }
    
    //## auto_generated 
    public boolean getLed_status() {
        return led_status;
    }
    
    //## auto_generated 
    public void setLed_status(boolean p_led_status) {
        led_status = p_led_status;
    }
    
    //## auto_generated 
    public int getMontant() {
        return montant;
    }
    
    //## auto_generated 
    public void setMontant(int p_montant) {
        montant = p_montant;
    }
    
    //## auto_generated 
    public ControleurConsommateur getItsControleurConsommateur() {
        return itsControleurConsommateur;
    }
    
    //## auto_generated 
    public void setItsControleurConsommateur(ControleurConsommateur p_ControleurConsommateur) {
        itsControleurConsommateur = p_ControleurConsommateur;
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
                itsPasserelle_1._removeItsCompteur(this);
            }
        __setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._addItsCompteur(this);
            }
        _setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle_1() {
        itsPasserelle_1 = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Compteur.java
*********************************************************************/

