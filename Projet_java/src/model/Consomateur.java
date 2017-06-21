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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    
    public void choisirFournisseurUI(){
    	Fournisseur[] liste = {new Fournisseur("EDF", 50), new Fournisseur("ENGIE", 60), new Fournisseur("ELEKTEC", 40)};
    	//String fournisseurs[] = {"EDF", "ENGIE", "ELEKTEC"};
    	//int tarif[] = {50, 60, 40};
    	
    	JFrame frame;
    	frame = new JFrame();
    	FlowLayout f = new FlowLayout();
    	f.setVgap(30);
    	frame.setLayout(f);
    	frame.setTitle("ElekTec - Choisir un fournisseur");
    	frame.setBounds(20, 20, 300, 250);
    	frame.getContentPane().setBackground(new Color(252, 221, 161));
    	frame.setVisible(true);
    	
    	JLabel titre;
    	if(this.fournisseur == null){
    		titre = new JLabel("Choisir un fournisseur");
    	} else {
    		titre = new JLabel("Changer de fournisseur");    				
    	}
    	titre.setFont(new Font("Arial", Font.BOLD, 20));
    	frame.add(titre);
    	
    	GridLayout gl = new GridLayout(2, 1);
    	gl.setVgap(8);
    	JPanel jp = new JPanel(gl);
    	jp.setPreferredSize(new Dimension(200, 60));
    	jp.setBackground(new Color(252, 221, 161));
    	
    	JComboBox<Fournisseur> combo = new JComboBox<>(liste);
    	JButton valider = new JButton("Sauvegarder");
    	valider.setBackground(new Color(255, 255, 65));
    	valider.setPreferredSize(new Dimension(200, 40));
    	valider.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}		
			@Override
			public void mousePressed(MouseEvent e) {}	
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				setFournisseur((Fournisseur) combo.getSelectedItem());
				JOptionPane.showMessageDialog(frame, "Fournisseur mis à jour", "Information", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
			}
    	});
    	
    	jp.add(combo);
    	jp.add(valider);
    	
    	frame.add(jp);
    	
    	
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

        System.out.println("Modification effectuée, votre nom est : "+this.nom+" et votre prenom est : " + this.prenom);
    }
    
    public void editerProfilUI(){
    	JFrame frame;
    	frame = new JFrame();
    	FlowLayout f = new FlowLayout();
    	f.setVgap(30);
    	frame.setLayout(f);
    	frame.setTitle("ElekTec - Mon profil");
    	frame.setBounds(20, 20, 300, 300);
    	frame.getContentPane().setBackground(new Color(252, 221, 161));
    	frame.setVisible(true);
    	
    	JLabel titre = new JLabel("Modifier mon profil");
    	titre.setFont(new Font("Arial", Font.BOLD, 20));
    	
    	frame.add(titre);
    	
    	GridLayout gl = new GridLayout(3, 1);
    	gl.setVgap(8);
    	JTextField prenomfield = new JTextField(this.prenom);
    	prenomfield.setPreferredSize(new Dimension(200, 30));
    	JTextField nomfield = new JTextField(this.nom);
    	nomfield.setPreferredSize(new Dimension(200, 30));
    	
    	JPanel jp = new JPanel(gl);
    	jp.setPreferredSize(new Dimension(200, 120));
    	jp.add(prenomfield);
    	jp.add(nomfield);
    	
    	JButton valider = new JButton("Sauvegarder");
    	valider.setPreferredSize(new Dimension(200, 40));
    	valider.setBackground(new Color(255, 255, 65));
    	valider.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}		
			@Override
			public void mousePressed(MouseEvent e) {}	
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!nomfield.getText().equals("") && !prenomfield.getText().equals("")){
					changerNomPrenom(nomfield.getText(), prenomfield.getText());
					JOptionPane.showMessageDialog(frame, "Profil mis à jour", "Information", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "Aucun des champs ne doit être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
    	
    	jp.add(valider);
    	jp.setBackground(new Color(252, 221, 161));
    	frame.add(jp);
    	
    }
    
    public void changerNomPrenom(String nom, String prenom){
    	this.nom = nom;
    	this.prenom = prenom;
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
    
    public void afficherUI(){
    	JFrame frame;
    	frame = new JFrame();
    	FlowLayout f = new FlowLayout();
    	f.setVgap(50);
    	frame.setLayout(f);
    	frame.setTitle("ElekTec - Mon profil");
    	frame.setBounds(20, 20, 500, 200);
    	frame.getContentPane().setBackground(new Color(252, 221, 161));
    	frame.setVisible(true);
    	
    	JLabel displayLabel = new JLabel("Compte client : ");
    	JLabel nomClient = new JLabel(prenom.substring(0, 1).toUpperCase()+ prenom.substring(1) + " " + this.nom.toUpperCase());
    	nomClient.setFont(new Font("Arial", Font.BOLD, 20));
    	
    	frame.add(displayLabel);
    	frame.add(nomClient);
    	
   }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/model/Consomateur.java
*********************************************************************/

