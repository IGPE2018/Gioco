package gioco;

import java.awt.*;

import javax.swing.*;

public class GamePanel extends JPanel{
public GamePanel() {
	super();
	initGUI();
	//initEH();
}

JButton play,exit;
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension dim = tk.getScreenSize();
Dimension MinSize = new Dimension (5,75);	//DICHIARO LE DIVERSE DIMENSIONI PER GLI OGGETTI
Dimension PrefSize = new Dimension (5,75);
Dimension MaxSize = new Dimension (5,50);
Dimension MaxSize2 = new Dimension (5,100);
Dimension MaxSize1 = new Dimension (5,dim.height/6);
JLabel title,testo;
Font myfont=new Font("Helvetica",Font.BOLD,60);		//DICHIARO I DIVERSI FONT 
Font myfont1=new Font("Helvetica",Font.BOLD,25);
public void initGUI() {
	this.setVisible(true);
	this.setFocusable(true);
	this.setSize(dim);
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //USO IL BOX LAYOUT PER RENDERE LA PAGINA AUTORIDIMENSIONABILE 
			
	play=new JButton("Play");
	title=new JLabel("Menù");
	exit=new JButton("Exit");
	testo=new JLabel("BRAVOOO!");
	
	play.setMaximumSize(new Dimension(400,50));
	testo.setPreferredSize(new Dimension(400,50));
	exit.setMaximumSize(new Dimension(400,50));
	testo.setFont(myfont);
	exit.setFont(myfont1);
	play.setFont(myfont1);
	play.setAlignmentX(Component.CENTER_ALIGNMENT);
	testo.setAlignmentX(Component.CENTER_ALIGNMENT);
	exit.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	this.add(testo);
	//play.setBounds(dim.width/2-200, dim.height/3, 400, 50);
	//exit.setBounds(dim.width/2-200, dim.height/3+75, 400, 50);
	
	//INSERISCO GLI OGGETTI IN ORDINE NEL BORDLAYOUT
	/*this.add(new Box.Filler(MinSize,PrefSize,MaxSize2)); //DISTANZIATORI
	
	this.add(new Box.Filler(MinSize, PrefSize, MaxSize1));
	this.add(play);
	this.add(new Box.Filler(MinSize, PrefSize, MaxSize));
	this.add(exit);*/
	
}
}
