/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Fournisseur
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/model/Fournisseur.java
*********************************************************************/

package model;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// model/Fournisseur.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class Fournisseur 
public class Fournisseur {
    
    protected int id;		//## attribute id 
    
    protected string nom;		//## attribute nom 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected LinkedList<Passerelle> itsPasserelle_1 = new LinkedList<Passerelle>();		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  Fournisseur() {
    }
    
    //## operation definirTarif() 
    public void definirTarif() {
        //#[ operation definirTarif() 
        //#]
    }
    
    //## operation genererFacture() 
    public void genererFacture() {
        //#[ operation genererFacture() 
        //#]
    }
    
    //## operation informerClientNewTarif() 
    public void informerClientNewTarif() {
        //#[ operation informerClientNewTarif() 
        //#]
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
    public string getNom() {
        return nom;
    }
    
    //## auto_generated 
    public void setNom(string p_nom) {
        nom = p_nom;
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
    public ListIterator<Passerelle> getItsPasserelle_1() {
        ListIterator<Passerelle> iter = itsPasserelle_1.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1.add(p_Passerelle);
    }
    
    //## auto_generated 
    public void addItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._setItsFournisseur(this);
            }
        _addItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _removeItsPasserelle_1(Passerelle p_Passerelle) {
        itsPasserelle_1.remove(p_Passerelle);
    }
    
    //## auto_generated 
    public void removeItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle.__setItsFournisseur(null);
            }
        _removeItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle_1() {
        itsPasserelle_1.clear();
    }
    
    //## auto_generated 
    public void clearItsPasserelle_1() {
        ListIterator<Passerelle> iter = itsPasserelle_1.listIterator();
        while (iter.hasNext()){
            (itsPasserelle_1.get(iter.nextIndex()))._clearItsFournisseur();
            iter.next();
        }
        _clearItsPasserelle_1();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Fournisseur.java
*********************************************************************/

