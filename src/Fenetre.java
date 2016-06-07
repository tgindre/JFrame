import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  
	public Fenetre(){
		//d�finit un titre pour la fen�tre
		this.setTitle("Ma premi�re fen�tre Java");
		//d�finit la taille de la fen�tre en pixel
		this.setSize(400, 500);
		//centre la fen�tre
		//this.setLocationRelativeTo(null);
		//positionne la fen�tre aux coordonn�es sur l'�cran
		this.setLocation(0,0);
		//termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		
		//instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		//d�finition de sa couleur de fon
		pan.setBackground(Color.ORANGE);
		//on pr�vient notre JFrame que notre JPanel sera son content pane
		//this.setContentPane(pan);
		this.setContentPane(new Panneau());
		
		//rend la fen�tre visible
		this.setVisible(true);
		//interdit  de redimensionner la fen�tre
		//this.setResizable(false);
		//garde la fen�tre au premier plan quoi qu'il advienne
		//this.setAlwaysOnTop(true);
		//retire les contours et les boutons de contr�le ?
		//this.setUndecorated(true);
  }
}