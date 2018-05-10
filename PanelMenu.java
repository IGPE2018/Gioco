package gioco;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelMenu extends JPanel {
	public PanelMenu() {
		super();
		initGUI();
		//initEH();
	}
	
	JButton play,exit,setting;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension dim = tk.getScreenSize();
	GamePanel g;
	Dimension MinSize = new Dimension (5,75);	//DICHIARO LE DIVERSE DIMENSIONI PER GLI OGGETTI
	Dimension PrefSize = new Dimension (5,75);
	Dimension MaxSize = new Dimension (5,50);
	Dimension MaxSize2 = new Dimension (5,100);
	Dimension MaxSize1 = new Dimension (5,dim.height/6);
	JLabel title;
	Font myfont=new Font("Helvetica",Font.BOLD,60);		//DICHIARO I DIVERSI FONT 
	Font myfont1=new Font("Helvetica",Font.BOLD,25);
	public void initGUI() {
		g=new GamePanel();
		this.setVisible(true);
		this.setFocusable(true);
		this.setSize(dim);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //USO IL BOX LAYOUT PER RENDERE LA PAGINA AUTORIDIMENSIONABILE 
		
		setting=new JButton("Setting");
		play=new JButton("Play");
		title=new JLabel("Menù");
		exit=new JButton("Exit");
		
		setting.setMaximumSize(new Dimension(400,50));
		play.setMaximumSize(new Dimension(400,50));
		title.setPreferredSize(new Dimension(400,50));
		exit.setMaximumSize(new Dimension(400,50));
		setting.setFont(myfont1);
		title.setFont(myfont);
		exit.setFont(myfont1);
		play.setFont(myfont1);
		setting.setAlignmentX(Component.CENTER_ALIGNMENT);
		play.setAlignmentX(Component.CENTER_ALIGNMENT);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		exit.setAlignmentX(Component.CENTER_ALIGNMENT);
		//play.setBounds(dim.width/2-200, dim.height/3, 400, 50);
		//exit.setBounds(dim.width/2-200, dim.height/3+75, 400, 50);
		
		//INSERISCO GLI OGGETTI IN ORDINE NEL BORDLAYOUT
		this.add(new Box.Filler(MinSize,PrefSize,MaxSize2)); //DISTANZIATORI
		this.add(title);
		this.add(new Box.Filler(MinSize, PrefSize, MaxSize1));
		this.add(play);
		this.add(new Box.Filler(MinSize, PrefSize, MaxSize));
		this.add(setting);
		this.add(new Box.Filler(MinSize, PrefSize, MaxSize));
		this.add(exit);
		
	}
	/*public void initEH() {								
		play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				add(g);
				

			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

	}*/

	
}
