/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CentreLecture
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/model/CentreLecture.java
*********************************************************************/

package model;


//----------------------------------------------------------------------------
// model/CentreLecture.java                                                                  
//----------------------------------------------------------------------------

//## package model 


//## class CentreLecture 
public class CentreLecture {
    
    protected int mesure;		//## attribute mesure 
    
    protected int montant_consome;		//## attribute montant_consome 
    
    protected Passerelle itsPasserelle;		//## link itsPasserelle 
    
    protected Passerelle itsPasserelle_1;		//## link itsPasserelle_1 
    
    
    // Constructors
    
    //## auto_generated 
    public  CentreLecture() {
    }
    
    //## operation pull() 
    public void pull() {
        //#[ operation pull() 
        //#]
    }
    
    //## auto_generated 
    public int getMesure() {
        return mesure;
    }
    
    //## auto_generated 
    public void setMesure(int p_mesure) {
        mesure = p_mesure;
    }
    
    //## auto_generated 
    public int getMontant_consome() {
        return montant_consome;
    }
    
    //## auto_generated 
    public void setMontant_consome(int p_montant_consome) {
        montant_consome = p_montant_consome;
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
                itsPasserelle_1._removeItsCentreLecture(this);
            }
        __setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void setItsPasserelle_1(Passerelle p_Passerelle) {
        if(p_Passerelle != null)
            {
                p_Passerelle._addItsCentreLecture(this);
            }
        _setItsPasserelle_1(p_Passerelle);
    }
    
    //## auto_generated 
    public void _clearItsPasserelle_1() {
        itsPasserelle_1 = null;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/CentreLecture.java
*********************************************************************/

