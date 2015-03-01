import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;



public class frame extends JPanel{

	static JFrame f = new JFrame();


	static JPanel topPanel = new JPanel();
	JPanel centerPanel =  new JPanel();
	JPanel topCenterPanel = new JPanel();
	JPanel centerCenterPanel = new JPanel();
	JPanel rightTopPanel = new JPanel(new GridLayout(1,2));
	


	JLabel leftTopLabel = new JLabel("MY FRAME");
	JLabel icon = new JLabel();

	JLabel close = new JLabel("X");
	JLabel minimize = new JLabel("-");


	Image imageb = new ImageIcon("C:/Users/Owner/Desktop/shareqube/icons/down.jpg").getImage();
	Icon c = new ImageIcon(imageb);

	Font font = new Font("Arial Black", 1,16);
	Font font2 = new Font("Goudy Stout", 1,16);


	Dimension d = new Dimension();
	Dimension d2 = new Dimension();
	

	int x = 0;
	int y = 0;
	int fx = 0;
	int fy = 0;


	JButton button = new JButton("REMOVE");





	JButton b = new JButton("ENCRYPT");
		JButton C = new JButton("DECRYPT");
		JTextArea field1 = new JTextArea();
		JTextArea field2 = new JTextArea();

		JButton clear1 = new JButton("CLEAR");
		JButton clear2 = new JButton("CLEAR");
		JButton clear3 = new JButton("CLEAR ALL");


		JScrollPane scroll1 = new JScrollPane();
		JScrollPane scroll2 = new JScrollPane();

		Character test;

		String monday = new String("");		








	public frame(){

	setLayout(null);
	setBounds(0,0,f.getWidth(), f.getHeight());
	f.add(this);
	f.setSize(1300,700);
	//setLayout(new BorderLayout());
	
	
	

	new Move().move(f,leftTopLabel);
	
	
	d.setSize(this.getWidth(),30);
	d2.setSize(this.getWidth(),50);


	topPanel.setLayout(null);
	topPanel.setBackground(Color.orange);
	topPanel.setPreferredSize(d);
	topPanel.setOpaque(true);
	
	add(topPanel, BorderLayout.NORTH);
	

	leftTopLabel.setBounds(40,9,this.getWidth() - 130,25);
	leftTopLabel.setFont(font2);
	leftTopLabel.setHorizontalAlignment(SwingConstants.CENTER);
	leftTopLabel.setForeground(Color.white);
	topPanel.add(leftTopLabel);


	icon.setBounds(9,5,28,28);
	icon.setIcon(c);
	topPanel.add(icon);
	

	rightTopPanel.setBounds(this.getWidth() - 65,2,50,25);
	rightTopPanel.setOpaque(false);
	topPanel.add(rightTopPanel);

	
	
	
	minimize.setForeground(Color.white);
	minimize.setFont(font);
	minimize.setHorizontalAlignment(SwingConstants.CENTER);
	minimize.setBorder(BorderFactory.createBevelBorder(3, Color.red, Color.green, Color.blue, Color.pink));
	rightTopPanel.add(minimize);
	
	minimize.addMouseListener(

			new MouseAdapter(){

			public void mouseClicked(MouseEvent t){

				f.setState(JFrame.ICONIFIED);
	
		}

		
		});

	
	close.setForeground(Color.red);
	close.setFont(font);
	close.setHorizontalAlignment(SwingConstants.CENTER);
	close.setBorder(BorderFactory.createBevelBorder(4));
	rightTopPanel.add(close);
	
	close.addMouseListener(

			new MouseAdapter(){

			public void mouseClicked(MouseEvent t){


				System.exit(0);
				
	
		}

		
		});




	centerPanel.setLayout(new BorderLayout());
	centerPanel.setOpaque(true);
	centerPanel.setBorder(BorderFactory.createLineBorder(Color.orange,10));
	add(centerPanel,BorderLayout.CENTER);

	topCenterPanel.setLayout(null);
	//topCenterPanel.setBackground(Color.yellow);
	//topCenterPanel.setOpaque(true);
	topCenterPanel.setPreferredSize(d2);
	
	
	
	centerPanel.add(topCenterPanel,BorderLayout.NORTH);

	
	centerCenterPanel.setLayout(null);
	//centerCenterPanel.setBackground(Color.green);
	//centerCenterPanel.setOpaque(true);
	centerPanel.add(centerCenterPanel,BorderLayout.CENTER);










	
		field1.setBounds(20,100,700,100);
		field1.setLineWrap(true);
		field1.setFont(new Font("Dialog", 1, 15));
		field1.setForeground(Color.blue);
		add(field1);


		scroll1.setBounds(20,100,700,100);
		scroll1.setViewportView(field1);
		scroll1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		add(scroll1);



		field2.setBounds(20,250,700,100);
		field2.setLineWrap(true);
		field2.setFont(new Font("Dialog", 1, 15));
		field2.setForeground(Color.black);
		add(field2);
		

		
		scroll2.setBounds(20,250,700,100);
		scroll2.setViewportView(field2);
		scroll2.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		add(scroll2);


		clear1.setBounds(770,125,100,40);
		clear1.setBackground(new Color(80,150,220));
		clear1.setForeground(Color.white);
		clear1.setFont(new Font("Dialog", 1, 15));
		add(clear1);
		
		clear1.addActionListener(

			new ActionListener(){


			public void actionPerformed(ActionEvent e){
	

			field1.setText("");
		
				}


			});




		clear2.addActionListener(

			new ActionListener(){


			public void actionPerformed(ActionEvent e){
	

			field2.setText("");
		
				}


			});
		

		clear2.setBounds(770,275,100,40);
		clear2.setBackground(new Color(80,150,220));
		clear2.setForeground(Color.white);
		clear2.setFont(new Font("Dialog", 1, 15));
		add(clear2);


		b.setBounds(40,400,200,50);
		b.setFont(new Font("Dialog", 1, 20));
		b.setBackground(new Color(80,150,220));
		b.setForeground(Color.white);
		add(b);


		b.addActionListener(

			new ActionListener(){


			public void actionPerformed(ActionEvent e){
	
			
			field2.setText("");
			monday = new String("");
			//text1 = new String("");

			String text1 = field1.getText().toLowerCase();
			int length = text1.length();
		
			field2.setText(length + "");
			

			int i = 0;


			for(i = 0 ; i < length ; i++){


				test = text1.charAt(i);

			if(test.equals('a')){

				test = 'C';

				}
			else if(test.equals('b')){

				test = 'F';

				}
			else if(test.equals('c')){

				test = 'I';

				}
			else if(test.equals('d')){

				test = 'L';

				}
			else if(test.equals('e')){

				test = 'O';

				}
			else if(test.equals('f')){

				test = 'R';

				}
			else if(test.equals('g')){

				test = 'Z';

				}
			else if(test.equals('h')){

				test = 'U';

				}
			else if(test.equals('i')){

				test = 'X';

				}
			else if(test.equals('j')){

				test = 'A';

				}
			else if(test.equals('k')){

				test = 'D';

				}
			else if(test.equals('l')){

				test = 'G';

				}
			else if(test.equals('m')){

				test = 'J';

				}
			else if(test.equals('n')){

				test = 'M';

				}
			else if(test.equals('o')){

				test = 'P';

				}
			else if(test.equals('p')){

				test = 'S';

				}
			else if(test.equals('q')){

				test = 'V';

				}
			else if(test.equals('r')){

				test = 'Y';

				}
			else if(test.equals('s')){

				test = 'B';

				}
			else if(test.equals('t')){

				test = 'E';

				}
			else if(test.equals('u')){

				test = 'H';

				}
			else if(test.equals('v')){

				test = 'K';

				}
			else if(test.equals('w')){

				test = 'N';

				}
			else if(test.equals('x')){

				test = 'Q';

				}
			else if(test.equals('y')){

				test = 'T';

				}
				
			else if(test.equals('z')){

				test = 'W';

				}
			else if(test.equals(' ')){

				test = '?';

				}
			else if(test.equals('\t')){

				test = '%';

				}
					




			monday  = ""+monday+""+test+""; 
		

			

			}

			field2.setText(monday);


			}

		});

		

		C.setBounds(270,400,200,50);
		C.setFont(new Font("Dialog", 1, 20));
		C.setBackground(new Color(80,150,220));
		C.setForeground(Color.white);
		add(C);


		
		C.addActionListener(

			new ActionListener(){


			public void actionPerformed(ActionEvent e){
	
			
			field2.setText("");
			monday = new String("");
			

			String text1 = field1.getText().toLowerCase();
			int length = text1.length();
		
			field2.setText(length + "");
			

			int i = 0;


			for(i = 0 ; i < length ; i++){


				test = text1.charAt(i);

			if(test.equals('a')){

				test = 'J';

				}
			else if(test.equals('b')){

				test = 'S';

				}
			else if(test.equals('c')){

				test = 'A';

				}
			else if(test.equals('d')){

				test = 'K';

				}
			else if(test.equals('e')){

				test = 'T';

				}
			else if(test.equals('f')){

				test = 'B';

				}
			else if(test.equals('g')){

				test = 'L';

				}
			else if(test.equals('h')){

				test = 'U';

				}
			else if(test.equals('i')){

				test = 'C';

				}
			else if(test.equals('j')){

				test = 'M';

				}
			else if(test.equals('k')){

				test = 'V';

				}
			else if(test.equals('l')){

				test = 'D';

				}
			else if(test.equals('m')){

				test = 'N';

				}
			else if(test.equals('n')){

				test = 'W';

				}
			else if(test.equals('o')){

				test = 'E';

				}
			else if(test.equals('p')){

				test = 'O';

				}
			else if(test.equals('q')){

				test = 'X';

				}
			else if(test.equals('r')){

				test = 'F';

				}
			else if(test.equals('s')){

				test = 'P';

				}
			else if(test.equals('t')){

				test = 'Y';

				}
			else if(test.equals('u')){

				test = 'H';

				}
			else if(test.equals('v')){

				test = 'Q';

				}
			else if(test.equals('w')){

				test = 'Z';

				}
			else if(test.equals('x')){

				test = 'I';

				}
			else if(test.equals('y')){

				test = 'R';

				}
				
			else if(test.equals('z')){

				test = 'G';

				}
			else if(test.equals('?')){

				test = ' ';

				}
			else if(test.equals('%')){

				test = '\t';

				}
					




			monday  = ""+monday+""+test+""; 
		

			

			}

			field2.setText(monday);


			}

		});


		clear3.setBounds(500,400,200,50);
		clear3.setFont(new Font("Dialog", 1, 20));
		clear3.setBackground(new Color(80,150,220));
		clear3.setForeground(Color.white);
		add(clear3);



		clear3.addActionListener(

			new ActionListener(){


			public void actionPerformed(ActionEvent e){
	

		field1.setText("");
		field2.setText("");


			}

		});









	f.setUndecorated(true);
	f.setDefaultCloseOperation(3);
	f.setVisible(true);

	}










	class Move{


	public void move(final JFrame f, JLabel leftTopLabel){

	leftTopLabel.addMouseMotionListener(

		new MouseMotionAdapter(){
	

	public void mouseDragged(MouseEvent v){


	x = v.getXOnScreen() - fx;
	y = v.getYOnScreen() - fy;

	f.setLocation(x,y);




	}



	});


	leftTopLabel.addMouseListener(


	new MouseAdapter(){


	public void mousePressed(MouseEvent t){


	fx = t.getX();
	fy = t.getY();

	}


	});





	}




	}



	public void paintComponent(Graphics g){
	//super.paintComponent(g);
	g.setFont(new Font("Dialog", 1, 50));
	g.setColor(Color.white);

	g.drawString("Encrypt", 315,55);
	
	g.setColor(new Color(80,150,220));
	g.drawString("Soft", 500,55);

	g.setFont(new Font("Dialog", 1, 50));
	g.setColor(Color.white);
	g.drawString("™", 600,55);
		
	
	g.setFont(new Font("Comic Sans MS", 1, 20));
	g.drawString("COURTESY: Eddy DDon Eyoh™, Monday & Ekemzzy", 220,500);
	g.drawString("Copyright ©2014.", 400,530);
	}
	





	public static void main(String args[]){

	new frame();


	}

}
