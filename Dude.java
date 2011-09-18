import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;


public class Dude {
int x, dx, y;
Image apple;
boolean lpressed = false;
boolean rpressed = false;
ImageIcon i = new ImageIcon(getClass().getResource("Images/still.png"));
ImageIcon ir = new ImageIcon(getClass().getResource("Images/stillR.png"));
ImageIcon il = new ImageIcon(getClass().getResource("Images/stillL.png"));
Random rand = new Random();
public Dude(){
	apple = i.getImage();
	x = rand.nextInt(250) + 125;
	y = 180;
}
public void move(){
	x = x + dx;
}
public int getX(){
	return x;
}
public int getY(){
	return y;
}
public Image getImage(){
	return apple;
}
public int getSpeedHoriz(){
	return dx;
}
public void keyPressed(KeyEvent e){
	int key = e.getKeyCode();
	if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A){
		if(rpressed == true){	
			dx = 0;
			apple = i.getImage();
			}
		else if (rpressed == false){
		dx = -1;
		}
		apple = il.getImage();
		lpressed = true;
		}	
	if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D){
		if (lpressed == true){
			dx = 0;
			apple = i.getImage();
		}
	else if (lpressed == false){
		dx = 1;
	}
		apple = ir.getImage();
		rpressed = true;
}
	if (key == KeyEvent.VK_ESCAPE){
		Close();
	}
}
public void keyReleased(KeyEvent e){
	int key = e.getKeyCode();
	if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A){
		if (rpressed == false){
			dx = 0;
			apple = i.getImage();
			}
			else if (rpressed == true){
				dx = 1;
			}
		
		lpressed = false;
	}
	if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D){	
		if (lpressed == false){
		dx = 0;
		apple = i.getImage();
		}
		else if (lpressed == true){
			dx = -1;
		}
		rpressed = false;
		}

}
public void Close(){
	Frame.Close();
	
}
}
