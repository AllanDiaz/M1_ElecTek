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


//----------------------------------------------------------------------------
// model/Consomateur.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class Consomateur 
public class Consomateur {
    
    protected String fournisseur;		//## attribute fournisseur 
    
    protected int id;		//## attribute id 
    
    protected String nom;		//## attribute nom 
    
    protected String prenom;		//## attribute prenom 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected Passerelle itsPasserelle_1;		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  Consomateur() {
    }
    
    //## operation choisirFournisseur() 
    public void choisirFournisseur() {
        //#[ operation choisirFournisseur() 
        //#]
    }
    
    //## operation consulterConso() 
    public void consulterConso() {
        //#[ operation consulterConso() 
        //#]
    }
    
    //## operation editerProfil() 
    public void editerProfil() {
        //#[ operation editerProfil() 
        //#]
    }
    
    //## operation imprimerFacture() 
    public void imprimerFacture() {
        //#[ operation imprimerFacture() 
        //#]
    }
    
    //## auto_generated 
    public String getFournisseur() {
        return fournisseur;
    }
    
    //## auto_generated 
    public void setFournisseur(String p_fournisseur) {
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Consomateur.java
*********************************************************************/

