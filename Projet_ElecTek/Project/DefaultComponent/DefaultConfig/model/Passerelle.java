/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Passerelle
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/model/Passerelle.java
*********************************************************************/

package model;

//## auto_generated
import java.util.*;

//----------------------------------------------------------------------------
// model/Passerelle.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class Passerelle 
public class Passerelle {
    
    protected int infos;		//## attribute infos 
    
    protected LinkedList<CentreLecture> itsCentreLecture = new LinkedList<CentreLecture>();		//## link itsCentreLecture 
    
    protected LinkedList<Compteur> itsCompteur = new LinkedList<Compteur>();		//## link itsCompteur 
    
    protected LinkedList<Consomateur> itsConsomateur = new LinkedList<Consomateur>();		//## link itsConsomateur 
    
    protected Fournisseur itsFournisseur;		//## link itsFournisseur 
    
    
    // Constructors
    
    //## auto_generated 
    public  Passerelle() {
    }
    
    //## operation getInfos() 
    public void getInfos() {
        //#[ operation getInfos() 
        //#]
    }
    
    //## operation getMesure() 
    public void getMesure() {
        //#[ operation getMesure() 
        //#]
    }
    
    //## operation push() 
    public void push() {
        //#[ operation push() 
        //#]
    }
    
    //## auto_generated 
    public void setInfos(int p_infos) {
        infos = p_infos;
    }
    
    //## auto_generated 
    public ListIterator<CentreLecture> getItsCentreLecture() {
        ListIterator<CentreLecture> iter = itsCentreLecture.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsCentreLecture(CentreLecture p_CentreLecture) {
        itsCentreLecture.add(p_CentreLecture);
    }
    
    //## auto_generated 
    public void addItsCentreLecture(CentreLecture p_CentreLecture) {
        if(p_CentreLecture != null)
            {
                p_CentreLecture._setItsPasserelle_1(this);
            }
        _addItsCentreLecture(p_CentreLecture);
    }
    
    //## auto_generated 
    public void _removeItsCentreLecture(CentreLecture p_CentreLecture) {
        itsCentreLecture.remove(p_CentreLecture);
    }
    
    //## auto_generated 
    public void removeItsCentreLecture(CentreLecture p_CentreLecture) {
        if(p_CentreLecture != null)
            {
                p_CentreLecture.__setItsPasserelle_1(null);
            }
        _removeItsCentreLecture(p_CentreLecture);
    }
    
    //## auto_generated 
    public void _clearItsCentreLecture() {
        itsCentreLecture.clear();
    }
    
    //## auto_generated 
    public void clearItsCentreLecture() {
        ListIterator<CentreLecture> iter = itsCentreLecture.listIterator();
        while (iter.hasNext()){
            (itsCentreLecture.get(iter.nextIndex()))._clearItsPasserelle_1();
            iter.next();
        }
        _clearItsCentreLecture();
    }
    
    //## auto_generated 
    public ListIterator<Compteur> getItsCompteur() {
        ListIterator<Compteur> iter = itsCompteur.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsCompteur(Compteur p_Compteur) {
        itsCompteur.add(p_Compteur);
    }
    
    //## auto_generated 
    public void addItsCompteur(Compteur p_Compteur) {
        if(p_Compteur != null)
            {
                p_Compteur._setItsPasserelle_1(this);
            }
        _addItsCompteur(p_Compteur);
    }
    
    //## auto_generated 
    public void _removeItsCompteur(Compteur p_Compteur) {
        itsCompteur.remove(p_Compteur);
    }
    
    //## auto_generated 
    public void removeItsCompteur(Compteur p_Compteur) {
        if(p_Compteur != null)
            {
                p_Compteur.__setItsPasserelle_1(null);
            }
        _removeItsCompteur(p_Compteur);
    }
    
    //## auto_generated 
    public void _clearItsCompteur() {
        itsCompteur.clear();
    }
    
    //## auto_generated 
    public void clearItsCompteur() {
        ListIterator<Compteur> iter = itsCompteur.listIterator();
        while (iter.hasNext()){
            (itsCompteur.get(iter.nextIndex()))._clearItsPasserelle_1();
            iter.next();
        }
        _clearItsCompteur();
    }
    
    //## auto_generated 
    public ListIterator<Consomateur> getItsConsomateur() {
        ListIterator<Consomateur> iter = itsConsomateur.listIterator();
        return iter;
    }
    
    //## auto_generated 
    public void _addItsConsomateur(Consomateur p_Consomateur) {
        itsConsomateur.add(p_Consomateur);
    }
    
    //## auto_generated 
    public void addItsConsomateur(Consomateur p_Consomateur) {
        if(p_Consomateur != null)
            {
                p_Consomateur._setItsPasserelle_1(this);
            }
        _addItsConsomateur(p_Consomateur);
    }
    
    //## auto_generated 
    public void _removeItsConsomateur(Consomateur p_Consomateur) {
        itsConsomateur.remove(p_Consomateur);
    }
    
    //## auto_generated 
    public void removeItsConsomateur(Consomateur p_Consomateur) {
        if(p_Consomateur != null)
            {
                p_Consomateur.__setItsPasserelle_1(null);
            }
        _removeItsConsomateur(p_Consomateur);
    }
    
    //## auto_generated 
    public void _clearItsConsomateur() {
        itsConsomateur.clear();
    }
    
    //## auto_generated 
    public void clearItsConsomateur() {
        ListIterator<Consomateur> iter = itsConsomateur.listIterator();
        while (iter.hasNext()){
            (itsConsomateur.get(iter.nextIndex()))._clearItsPasserelle_1();
            iter.next();
        }
        _clearItsConsomateur();
    }
    
    //## auto_generated 
    public Fournisseur getItsFournisseur() {
        return itsFournisseur;
    }
    
    //## auto_generated 
    public void __setItsFournisseur(Fournisseur p_Fournisseur) {
        itsFournisseur = p_Fournisseur;
    }
    
    //## auto_generated 
    public void _setItsFournisseur(Fournisseur p_Fournisseur) {
        if(itsFournisseur != null)
            {
                itsFournisseur._removeItsPasserelle_1(this);
            }
        __setItsFournisseur(p_Fournisseur);
    }
    
    //## auto_generated 
    public void setItsFournisseur(Fournisseur p_Fournisseur) {
        if(p_Fournisseur != null)
            {
                p_Fournisseur._addItsPasserelle_1(this);
            }
        _setItsFournisseur(p_Fournisseur);
    }
    
    //## auto_generated 
    public void _clearItsFournisseur() {
        itsFournisseur = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Passerelle.java
*********************************************************************/

