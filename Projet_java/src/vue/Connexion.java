/*********************************************************************
	Rhapsody	: 8.1.5
	Login		: amathieu
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Connexion
//!	Generated Date	: Wed, 3, May 2017 
	File Path	: DefaultComponent/DefaultConfig/vue/Connexion.java
*********************************************************************/

package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Consomateur;


//----------------------------------------------------------------------------
// vue/Connexion.java                                                                  
//----------------------------------------------------------------------------

//## package vue 


//## class Connexion 
public class Connexion {
    
    protected Accueil itsAccueil;		//## link itsAccueil 
    
    private JTextField login;
    private JPasswordField password;
    
    private HashMap<String, String> users;
    // Constructors
    
    private JFrame main;
    
    // main
    public static void main(String[] args){
		Connexion c = new Connexion();
	}
    
    //## auto_generated 
    public  Connexion() {
    	
    	this.users = new HashMap<>();
    	users.put("jeremy.pascal", "password");
    	users.put("jeanbrice.canihac", "password");
    	users.put("alexis.mathieu", "password");
    	users.put("allan.diaz", "password");
    	
    	main = new JFrame();
    	main.setLayout(new FlowLayout());
    	main.setTitle("ElekTec - Connexion");
    	main.setBounds(20, 20, 550, 550);
    	main.getContentPane().setBackground(new Color(252, 221, 161));
    	
    	JLabel picLabel = new JLabel();
    	
    	try{
    		BufferedImage pic = ImageIO.read(new File("src/img/elektec_logo.png"));
    		picLabel.setIcon(new ImageIcon(pic));
    		picLabel.setSize(new Dimension(840, 161));
    		main.setIconImage(ImageIO.read(new File("src/img/favicon.png")));
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	    	
    	JLabel coLabel = new JLabel("Se connecter");
    	coLabel.setFont(new Font("Arial",Font.BOLD,20));
    	JLabel loginlabel = new JLabel("Login");
    	JLabel passlabel = new JLabel("Mot de passe");
    	this.login = new JTextField();
    	this.login.setPreferredSize(new Dimension(400, 30));
    	this.password = new JPasswordField();
    	this.password.setPreferredSize(new Dimension(400, 30));
    	
    	JButton connexion = new JButton("Connexion");
    	
    	// Ajout listener sur le bouton
    	connexion.addMouseListener(new MouseListener() {
			
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
				// Clic sur le bouton
				connexion();
			}
		});
    	
    	connexion.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}		
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// Press enter
				if(e.getKeyCode() == 10){
					connexion();
				}
			}
		});
    	
    	connexion.setBackground(new Color(255, 255, 65));
    	
    	GridLayout gl = new GridLayout(5, 1);
    	gl.setVgap(20);
    	JPanel pane = new JPanel(gl);
    	pane.setBackground(new Color(252, 221, 161));
    	main.add(picLabel);
    	pane.add(coLabel);
    	JPanel lg = new JPanel(new FlowLayout());
    	lg.setBackground(new Color(252, 221, 161));
    	lg.add(loginlabel);
    	lg.add(login);
    	pane.add(lg);
    	JPanel pwd = new JPanel(new FlowLayout());
    	pwd.setBackground(new Color(252, 221, 161));
    	pwd.add(passlabel);
    	pwd.add(password);
    	pane.add(pwd);
    	pane.add(connexion);
    	pane.setVisible(true);
    	pane.setPreferredSize(new Dimension(400, 360));
    	
    	main.add(pane);
    	main.setVisible(true);
    	    	
    }
    
    // TODO : Action onclick sur le bouton connexion
	public void connexion(){
    	
		if(this.login.getText().equals("") || String.valueOf(this.password.getPassword()).equals("")){
			JOptionPane.showMessageDialog(main, "Le login/mot ne doit pas être vide", "Erreur", JOptionPane.ERROR_MESSAGE);
		}
    	if(this.users.get(this.login.getText()).equals(String.valueOf(this.password.getPassword()))){
    	
	    	try{
		    	String[] ids = this.login.getText().split("\\.");
		    	String prenom = ids[0];
		    	String nom = ids[1];
		    	Consomateur c = new Consomateur(nom, prenom);
		    	
		    	// CREATION DE LA NOUVELLE FENETRE
		    	this.main.dispose();
		    	Accueil acc = new Accueil(c);
		    	
	    	} catch (ArrayIndexOutOfBoundsException e){
	    		JOptionPane.showMessageDialog(main, "Le login/mot de passe ne correspond pas", "Erreur", JOptionPane.ERROR_MESSAGE);
	    	}
	    	
    	} else {
    		JOptionPane.showMessageDialog(main, "Le login/mot de passe ne correspond pas", "Erreur", JOptionPane.ERROR_MESSAGE);
    		
    		this.password.setText("");
    	}
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/vue/Connexion.java
*********************************************************************/

