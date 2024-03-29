import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  
	public static int i = 0;
	
	public void paintComponent(Graphics g){
		//Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		i++;
		System.out.println("Je suis ex�cut�e ! " + i); 
	    int x1 = this.getWidth()/4;
	    int y1 = this.getHeight()/4;
	    
	    //rond plein
//	    g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    
	    //rond vide
//	    g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    
	    //rectangle vide
//	    g.drawRect(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    
	    //rectangle plein
//	    g.fillRect(x1, y1, this.getWidth()/2, this.getHeight()/2);
	    
	    //rectangle aux coins arrondis vide
//	    g.drawRoundRect(10, 10, 30, 50, 10, 10);
	    //rectangle aux coins arrondis plein
//	    g.fillRoundRect(55, 65, 55, 30, 5, 5);
	    
	    //trace une ligne entre les points de coordonn�es demand�s
//	    g.drawLine(0, 0, this.getWidth(), this.getHeight());
//	    g.drawLine(0, this.getHeight(), this.getWidth(), 0);
	    
	    //polygone vide
//	    int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
//	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
//	    g.drawPolygon(x, y, 8);
	    
	    //polygone plein
//	    int x2[] = {50, 60, 80, 90, 90, 80, 60, 50};
//	    int y2[] = {60, 50, 50, 60, 80, 90, 90, 80};
//	    g.fillPolygon(x2, y2, 8);
	    
	    //trace des lignes
//	    g.drawPolyline(x, y, 5);
	    
	    //affichage d'un texte de police d�finie
//	    Font font = new Font("Courier", Font.BOLD, 20);
//	    g.setFont(font);
//	    g.setColor(Color.red);  
//	    g.drawString("Coucou !!!", 10, 20);
	    
	    
	    //affichage d'une image statique
//	    try {
//	        Image img = ImageIO.read(new File("images.jpg"));
//	        g.drawImage(img, 0, 0, this);
//	        //Pour une image de fond
//	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
//	      } catch (IOException e) {
//	        e.printStackTrace();
//	      }
	    
	    //dessiner un d�grad�
//	    Graphics2D g2d = (Graphics2D)g;         
//	    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 0, Color.cyan, true);                
//	    g2d.setPaint(gp);
//	    g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
	   
	    Graphics2D g2d = (Graphics2D)g;
	    GradientPaint gp, gp2, gp3, gp4, gp5, gp6; 
	    gp = new GradientPaint(0, 0, Color.RED, 20, 0, Color.magenta, true);
	    gp2 = new GradientPaint(20, 0, Color.magenta, 40, 0, Color.blue, true);
	    gp3 = new GradientPaint(40, 0, Color.blue, 60, 0, Color.green, true);
	    gp4 = new GradientPaint(60, 0, Color.green, 80, 0, Color.yellow, true);
	    gp5 = new GradientPaint(80, 0, Color.yellow, 100, 0, Color.orange, true);
	    gp6 = new GradientPaint(100, 0, Color.orange, 120, 0, Color.red, true);

	    g2d.setPaint(gp);
	    g2d.fillRect(0, 0, 20, this.getHeight());               
	    g2d.setPaint(gp2);
	    g2d.fillRect(20, 0, 20, this.getHeight());
	    g2d.setPaint(gp3);
	    g2d.fillRect(40, 0, 20, this.getHeight());
	    g2d.setPaint(gp4);
	    g2d.fillRect(60, 0, 20, this.getHeight());
	    g2d.setPaint(gp5);
	    g2d.fillRect(80, 0, 20, this.getHeight());
	    g2d.setPaint(gp6);
	    g2d.fillRect(100, 0, 40, this.getHeight());
  }               
}