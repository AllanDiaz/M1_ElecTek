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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//----------------------------------------------------------------------------
// vue/Connexion.java                                                                  
//----------------------------------------------------------------------------

//## package vue 


//## class Connexion 
public class Connexion {
    
    protected Accueil itsAccueil;		//## link itsAccueil 
    
    private JTextField login;
    private JPasswordField password;
    private int loginReset = 0;
    private int passwordReset = 0;
    // Constructors
    
    //## auto_generated 
    public  Connexion() {
    	
    	JFrame main = new JFrame();
    	main.setLayout(new FlowLayout());
    	main.setTitle("ElekTec");
    	main.setBounds(20, 20, 550, 500);
    	main.setBackground(Color.WHITE);
    	
    	JLabel picLabel = new JLabel();
    	
    	try{
    		BufferedImage pic = ImageIO.read(new File("src/img/elektec_logo.png"));
    		 picLabel.setIcon(new ImageIcon(pic));
    		 picLabel.setSize(new Dimension(840, 161));
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    	
    	JLabel coLabel = new JLabel("Se connecter");
    	coLabel.setFont(new Font("Arial",Font.BOLD,20));
    	this.login = new JTextField();
    	this.password = new JPasswordField();
    	login.setText("Login");
    	login.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {}
			
			@Override
			public void focusGained(FocusEvent e) {
				resetLoginOnce();
			}
		});
    	
    	password.setText("Mot de passe");
    	password.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {}
			
			@Override
			public void focusGained(FocusEvent e) {
				resetPassOnce();
				
			}
		});
    	
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
    	
    	GridLayout gl = new GridLayout(5, 1);
    	gl.setVgap(20);
    	JPanel pane = new JPanel(gl);
    	main.add(picLabel);
    	pane.add(coLabel);
    	pane.add(login);
    	pane.add(password);
    	pane.add(connexion);
    	pane.setVisible(true);
    	pane.setPreferredSize(new Dimension(400, 300));
    	
    	main.add(pane);
    	main.setVisible(true);
    	    	
    }
    
    // TODO : Action onclick sur le bouton connexion
	public void connexion(){
    	System.out.println("login: " + this.login.getText());
    }
    
	// Reset du login sur le focus
    public void resetLoginOnce(){
    	if(this.loginReset == 0){
    		this.login.setText("");
    		this.loginReset = 1;
    	}
    }
    
    // Reset du password sur le focus
    public void resetPassOnce(){
    	if(this.passwordReset == 0){
    		this.password.setText("");
    		this.passwordReset = 1;
    	}
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/vue/Connexion.java
*********************************************************************/

