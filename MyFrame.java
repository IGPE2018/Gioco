package gioco;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame f = new MyFrame();
		
	}
	
	public MyFrame() {		//COSTRUTTORE DEL FRAME MENU
		super();
		initGUI();				//GRAFICA
		initEH();				//GESTORE EVENTI
	
	}
	
	PanelMenu p;
	GamePanel g;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension dim = tk.getScreenSize();
	//GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	//GraphicsDevice gd =ge.getDefaultScreenDevice();
	public void initGUI () {
		p=new PanelMenu();
		g=new GamePanel();
		this.setVisible(true);
		this.setSize(dim);
		this.setFocusable(true);
		this.add(p);
		setExtendedState(this.MAXIMIZED_BOTH);
		//this.setResizable(false);
		//gd.setFullScreenWindow(this);
		
	}
	public void initEH() {
		p.play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p.setVisible(false);
				add(g);

			}
		});
		p.exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//setVisible(false);				//RICHIAMO IL BOTTONE EXIT E RENDO 
				//dispose();
				System.exit(0);//E RENDO INVISIBILE E CHIUDO IL FRAME
			}
		});

	}


}