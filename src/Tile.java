import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tile {
   
   int x, y;
   int width, height;

   Tile(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }

   public void draw() {
	   JFrame frame = new JFrame("SpriteSheet");
       frame.setSize(480*2, 360*2);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JLabel emptyLabel = new JLabel();
       ImageIcon imageIcon = new ImageIcon("C:\\Users\\grand_000\\workspace\\Rendering\\res\\sprite_sheet.png"); // load the image to a imageIcon
       Image image = imageIcon.getImage(); // transform it 
       Image newimg = image.getScaledInstance(frame.getWidth(), frame.getHeight(),  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
       imageIcon = new ImageIcon(newimg);  // transform it back
       frame.add(new JLabel(imageIcon));
       //emptyLabel.setPreferredSize(new Dimension(700, 400));
       frame.getContentPane().add(emptyLabel, BorderLayout.PAGE_START);
       frame.pack();
       frame.setVisible(true);
   }

}