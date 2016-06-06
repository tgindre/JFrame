import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("Ma première fenêtre Java");//définit un titre pour la fenêtre
    this.setSize(400, 500);//définit la taille de la fenêtre en pixel
    //this.setLocationRelativeTo(null);//centre la fenêtre
    this.setLocation(0,0);//positionne la fenêtre aux coordonnées sur l'écran
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    //this.setResizable(false);//interdit  de redimensionner la fenêtre
    //this.setAlwaysOnTop(true);//garde la fenêtre au premier plan quoi qu'il advienne
    //this.setUndecorated(true);//retire les contours et les boutons de contrôle ?
  }
}