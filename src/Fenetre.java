import javax.swing.JFrame;
 
public class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("Ma premi�re fen�tre Java");//d�finit un titre pour la fen�tre
    this.setSize(400, 500);//d�finit la taille de la fen�tre en pixel
    //this.setLocationRelativeTo(null);//centre la fen�tre
    this.setLocation(0,0);//positionne la fen�tre aux coordonn�es sur l'�cran
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    //this.setResizable(false);//interdit  de redimensionner la fen�tre
    //this.setAlwaysOnTop(true);//garde la fen�tre au premier plan quoi qu'il advienne
    //this.setUndecorated(true);//retire les contours et les boutons de contr�le ?
  }
}