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
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Consomateur;

//----------------------------------------------------------------------------
// vue/Accueil.java                                                                  
//----------------------------------------------------------------------------

//## package vue 


//## class Accueil 
public class Accueil{
    
    protected choixFournisseur itsChoixFournisseur;		//## link itsChoixFournisseur 
    
    protected Consomation itsConsomation;		//## link itsConsomation 
    
    protected Facture itsFacture;		//## link itsFacture 
    
    private JFrame account;
    
    private Consomateur consomateur;
    
    static int  conso = 0;

    // Constructors
    
    //## auto_generated 
    public  Accueil(Consomateur c) {
    	this.consomateur = c;
    	
    	this.account = new JFrame();
    	FlowLayout f = new FlowLayout();
    	f.setVgap(50);
    	this.account.setLayout(f);
    	this.account.setTitle("ElekTec - Gestion du compte");
    	this.account.setBounds(20, 20, 550, 550);
    	this.account.getContentPane().setBackground(new Color(252, 221, 161));
    	this.account.setVisible(true);
    	
    	JLabel picLabel = new JLabel();
    	
    	try{
    		BufferedImage pic = ImageIO.read(new File("src/img/elektec_logo.png"));
    		picLabel.setIcon(new ImageIcon(pic));
    		picLabel.setSize(new Dimension(840, 161));
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    	this.account.add(picLabel);
    	
    	GridLayout gridLayout = new GridLayout(6,1);
    	gridLayout.setVgap(10);
    	JPanel jpanel = new JPanel(gridLayout);
    	jpanel.setBackground(new Color(252, 221, 161));
    	this.account.add(jpanel);
    	
    	 long temps = 2000;                      
		 long startTime = 0;                    
		 Timer timer = new Timer();             
		 TimerTask tache = new TimerTask() {     
		     @Override
		         public void run() {
		             Accueil.conso+=10;
		         }
		 };
		 timer.scheduleAtFixedRate(tache,startTime,temps);  // ici on lance la mecanique
		 
		 JButton bEditerProfil = new JButton("Editer mon profil");
		 JButton bChoisirFournisseur = new JButton("Choisir mon fournisseur");
		 JButton bAfficherProfil = new JButton("Afficher mon profil");
		 JButton bAfficherFournisseur = new JButton("Afficher mon fournisseur");
		 JButton bAfficherConsommation = new JButton("Afficher ma consommation");
		 JButton bPrintFacture = new JButton("Imprimer ma facture en PDF");
		 
		 bEditerProfil.setBackground(new Color(255, 255, 65));
		 bChoisirFournisseur.setBackground(new Color(255, 255, 65));
		 bAfficherProfil.setBackground(new Color(255, 255, 65));
		 bAfficherFournisseur.setBackground(new Color(255, 255, 65));
		 bAfficherConsommation.setBackground(new Color(255, 255, 65));
		 bPrintFacture.setBackground(new Color(255, 255, 65));
		 
		 jpanel.add(bEditerProfil);
		 jpanel.add(bChoisirFournisseur);
		 jpanel.add(bAfficherProfil);
		 jpanel.add(bAfficherFournisseur);
		 jpanel.add(bAfficherConsommation);
		 jpanel.add(bPrintFacture);
		 
		 bEditerProfil.addMouseListener(new MouseListener() {
			
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
				c.editerProfilUI();
			}
		});
		 
		 bChoisirFournisseur.addMouseListener(new MouseListener() {
				
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
					c.choisirFournisseurUI();
				}
			});
		 
		 bAfficherProfil.addMouseListener(new MouseListener() {
				
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
					c.afficherUI();
				}
			});
		 
		 bAfficherFournisseur.addMouseListener(new MouseListener() {
				
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
					try{
						c.getFournisseur().afficherUI();
					} catch (Exception ex){
						JOptionPane.showMessageDialog(account, "Vous n'avez pas encore choisi un fournisseur", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		 
		 bAfficherConsommation.addMouseListener(new MouseListener() {
				
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
					JOptionPane.showMessageDialog(account, "Votre consomation est de "+conso+"kw", "Consommation", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
		 
		 bPrintFacture.addMouseListener(new MouseListener() {
			
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
					try {
						Facture fa = new Facture(c,conso);
						fa.imprimer();
					} catch (Exception ee){
						JOptionPane.showMessageDialog(account, "Erreur à la génération de la facture", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
					try {
						Desktop.getDesktop().open(new File("facture.pdf"));
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(account, "Erreur à l'ouverture de la facture", "Erreur", JOptionPane.ERROR_MESSAGE);
					}
				}
		});
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

