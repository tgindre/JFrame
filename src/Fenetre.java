import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  
	public Fenetre(){
		//définit un titre pour la fenêtre
		this.setTitle("Ma première fenêtre Java");
		//définit la taille de la fenêtre en pixel
		this.setSize(400, 500);
		//centre la fenêtre
		//this.setLocationRelativeTo(null);
		//positionne la fenêtre aux coordonnées sur l'écran
		this.setLocation(0,0);
		//termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		
		//instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		//définition de sa couleur de fon
		pan.setBackground(Color.ORANGE);
		//on prévient notre JFrame que notre JPanel sera son content pane
		//this.setContentPane(pan);
		this.setContentPane(new Panneau());
		
		//rend la fenêtre visible
		this.setVisible(true);
		//interdit  de redimensionner la fenêtre
		//this.setResizable(false);
		//garde la fenêtre au premier plan quoi qu'il advienne
		//this.setAlwaysOnTop(true);
		//retire les contours et les boutons de contrôle ?
		//this.setUndecorated(true);
  }
}