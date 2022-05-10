import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Quiz_Finish extends JFrame {

	Image image4;
	
	public Quiz_Finish() {
		
	image4 = new ImageIcon("Winner.jpg").getImage();

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
	this.setVisible(true);	
	}
	public void paint(Graphics grafica) {
    
		Graphics2D grafica2D = (Graphics2D) grafica;
		grafica2D.setBackground(getBackground());
        grafica2D.drawImage(image4,0,70,null);
        grafica2D.setPaint(Color.red);
       	grafica2D.setFont(new Font("Ink Free",Font.BOLD,28));
       	grafica2D.drawString("Congratulations,you are a winner !!! ",10,60);
    
    }
}
