import javax.swing.JFrame;


public class Frame {
	static JFrame frame = new JFrame();
	public Frame(){
		frame.setTitle("2D Game");
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,355);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
}
	public static void main(String[] args){
		new Frame();
	}
	public static void Close(){
		frame.dispose();
	}
	public static JFrame getFrame(){
		return frame;
	}
	
}
