package prog;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.imageio.*;

import java.io.*;

import javax.swing.*;

class Main extends JFrame implements ActionListener{
JFrame f=new JFrame("Concetto");
GridBagConstraints g=new GridBagConstraints();
JTextField tf1=new JTextField();
private static int seconds=30;
private static int seconds1=20;
private static int seconds2=20;
private static int seconds3=30;
private static int seconds4=30;
private static int seconds5=30;
private static int seconds6=30;
private static int seconds7=30;
private static int seconds8=30;
private static int total=600;
private static int count=0;
private static int count_que1=0;
private static int count_que2=0;
private static int count_que3=0;
private static int count_que4=0;
private static int count_que5=0;
private static int count_que6=0;
private static int count_que7=0;
private static int count_que8=0;
private static int count_que9=0;
JLabel l1=new JLabel("Enter the code: ");
JButton b1=new button("START");
JPanel p1=new JPanel();
JLabel l12=new JLabel("						");
String Bid,Answer;
int Score=100;

Main(){
	f.setLayout(new GridBagLayout());
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	tf1.setSize(200, 100);
	p1.setSize(600, 600);
	g.gridx=1;
	g.gridy=1;
	f.add(p1,g);
	p1.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	gp.gridx=0;gp.gridy=0;
	p1.add(l1,gp);
	l1.setFont(new Font("Georgia",Font.ITALIC,20));
	gp.gridx=1;
	gp.gridy=0;
	gp.weightx=2;
    gp.fill=GridBagConstraints.HORIZONTAL;
	p1.add(tf1,gp);
	gp.gridx=3;
	gp.gridy=0;
	p1.add(l12,gp);
	gp.gridx=1;
	gp.gridy=1;
	gp.insets = new Insets(10,0,0,0);
	p1.add(b1,gp);
	b1.addActionListener(this);
	tf1.addFocusListener(new FocusListener(){
		@Override
		public void focusLost(FocusEvent e){
		}
		@Override
		public void focusGained(FocusEvent e) {
			tf1.setText("");
		}
	});
	f.pack();
	f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
	JButton b=(JButton)e.getSource();
	if(b==b1){
		String s1=tf1.getText();
		if(s1.equals("")){
			l12.setText("Enter the code!");
		}else if(s1.equals("182")){
			pan2();
		}else{
			l12.setText("Incorrect code!!");
		}
		}	
}
private void pan2() {
	// TODO Auto-generated method stub
	f.setLayout(new GridBagLayout());
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	JLabel l2=new JLabel("Rules for the GAME");
	l2.setFont(new Font("Courier",Font.ITALIC,25));
	JButton b2=new JButton("Next");
	l2.setBounds(700, 10, 200, 100);
	g.gridx=1;
	g.gridy=0;
	f.add(l2,g);
	JLabel lr=new JLabel("RULES");
	lr.setFont(new Font("Georgia",Font.ITALIC,20));
	lr.setText("<html><body width='800px'>1. The event duration will be of 3 hours.<br><br>2. Each player will be given 100 points initially at the beginning of the competition.<br><br>3. The player has to bet these points against the questions. He can bet these 100 points on the 5 questions given as he likes. He is allowed to bet on any number of questions less than or equal to 5.<br><br>4. The record of every player will be maintained on a software which would contain the information related to players’ bet on questions and points left.<br><br>5. If the player has solved the questions then those points multiplied by the corresponding multiplier will be given to them (refer the table given). Else they lose the points.<br><br>6. The players can bet the points twice, once when he starts the competition and next he can bet the earned points again (in a similar fashion) after attempting all his chosen questions.<br><br>7. There will be 5 levels of difficulty for each betting session and each difficulty level contains 3 questions that will be randomly allotted to the coder.<br><br> <br><br> <br><br>And similarly set B will be present for the second round of betting.<br><br>8. In the case of a tie we check who solved the tougher question and if this happens to be the same too, then whoever bet more wins. If the amount bet happens to be same too, then the next difficulty level will be considered and so on until a winner is found. ( Note only those levels in which a correct solution is submitted will be taken for consideration).</body> </html>");
	g.gridx=1;
	g.gridy=2;
	g.insets = new Insets(100,0,0,0);
	f.add(lr,g);
	b2.setBackground(Color.GRAY);
	b2.setSize(100, 10);
	g.gridx=3;
	g.gridy=4;
	f.add(b2,g);
	p1.setVisible(false);
	
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			l2.setVisible(false);
			b2.setVisible(false);
			lr.setVisible(false);
			pan3();
		}
	});
}
private void pan3() {
	JLabel game_count=new JLabel();
	game_count.setFont(new Font("Georgia",Font.ITALIC,25));	
	game_count.setForeground(Color.black);
	f.setLayout(new GridBagLayout());
	
	JPanel pa=new JPanel();
	JLabel l3=new JLabel("Brief description of Questions");
	
	l3.setFont(new Font("Courier",Font.ITALIC,25));
	
	g.gridx=0;g.gridy=0;
	f.add(pa,g);
	g.gridx=0;g.gridy=1;
	JPanel pb=new JPanel();
	f.add(pb,g);
	pa.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();	
	
	
	JLabel la=new JLabel("1) Illusion of the BLUE EYES!       Multiplier:(x5)                "); la.setFont(new Font("Georgia",Font.ITALIC,20)); 
	JLabel lb=new JLabel("2) Guess the next number!           Multiplier:(x2)                "); lb.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel lc=new JLabel("3)10-Digit Number!!                 Multiplier:(x3)                "); lc.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel ld=new JLabel("4)Master-MIND                       Multiplier:(x3)                "); ld.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel le=new JLabel("5)Grouping letters!                 Multiplier:(x3)                "); le.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel lf=new JLabel("6)Blue eyed People!                 Multiplier:(x5)                "); lf.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel lg=new JLabel("7)Apple Transport!                  Multiplier:(x4)                "); lg.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel lh=new JLabel("8)Chicken from restaurant!!         Multiplier:(x5)                "); lh.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel li=new JLabel("9)GAME Show!!                       Multiplier:(x5)                "); li.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel lj=new JLabel("--------------------------------"); lj.setFont(new Font("Georgia",Font.ITALIC,20));
	JLabel Sc=new JLabel("ToTal Score: ");
	JLabel Scc=new JLabel(Integer.toString(Score));
	
	JButton ba=new JButton("View");
	JButton bb=new JButton("View");	
	JButton bc=new JButton("View");
	JButton bd=new JButton("View");
	JButton be=new JButton("View");
	JButton bf=new JButton("View");
	JButton bg=new JButton("View");
	JButton bh=new JButton("View");
	JButton bi=new JButton("View");
	JButton bj=new JButton("View");
	JButton exit=new JButton("Submit & Exit the game!");
	if(count_que1!=0){
		ba.setVisible(false);
	}
	
	gp.gridx=0;gp.gridy=0;
	pa.add(l3,gp);
	f.add(game_count);
	gp.gridx=0;gp.gridy=1; gp.insets = new Insets(50,0,0,0);
	pa.add(la,gp);
	gp.gridx=0;gp.gridy=2;gp.insets = new Insets(50,0,0,0);
	pa.add(lb,gp);
	gp.gridx=0;gp.gridy=3;gp.insets = new Insets(50,0,0,0);
	pa.add(lc,gp);
	gp.gridx=0;gp.gridy=4;gp.insets = new Insets(50,0,0,0);
	pa.add(ld,gp);
	gp.gridx=0;gp.gridy=5;gp.insets = new Insets(50,0,0,0);
	pa.add(le,gp);
	gp.gridx=0;gp.gridy=6;gp.insets = new Insets(50,0,0,0);
	pa.add(lf,gp);
	gp.gridx=0;gp.gridy=7;gp.insets = new Insets(50,0,0,0);
	pa.add(lg,gp);
	gp.gridx=0;gp.gridy=8;gp.insets = new Insets(50,0,0,0);
	pa.add(lh,gp);
	gp.gridx=0;gp.gridy=9;gp.insets = new Insets(50,0,0,0);
	pa.add(li,gp);
	gp.gridx=0;gp.gridy=10;gp.insets = new Insets(50,0,0,0);
	pa.add(lj,gp);
	gp.gridx=3;gp.gridy=1;
	pa.add(ba,gp);
	gp.gridx=3;gp.gridy=2;
	pa.add(bb,gp);
	gp.gridx=3;gp.gridy=3;
	pa.add(bc,gp);
	gp.gridx=3;gp.gridy=4;
	pa.add(bd,gp);
	gp.gridx=3;gp.gridy=5;
	pa.add(be,gp);
	gp.gridx=3;gp.gridy=6;
	pa.add(bf,gp);
	gp.gridx=3;gp.gridy=7;
	pa.add(bg,gp);
	gp.gridx=3;gp.gridy=8;
	pa.add(bh,gp);
	gp.gridx=3;gp.gridy=9;
	pa.add(bi,gp);
	gp.gridx=3;gp.gridy=10;
	pa.add(bj,gp);
	gp.gridx=5;gp.gridy=12;
	pa.add(exit,gp);
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(total>0)				
			{
				total--;
				game_count.setText("Time remaining :" + total);
				
			}else{
				try {
					if(count==0){
					pa.setVisible(false);
					l3.setVisible(false);
					exit();
					count+=1;
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}	
		}	
	});
	timer.start();
	
	game_count.setText("Time remaining :" + total);
	ba.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que1==0){
				que1();
				count_que1=1;
				}else{
					
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que2==0){
					que2();
					count_que2=1;
					}else{
						bb.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bc.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que3==0){
					que3();
					count_que3=1;
					}else{
						bc.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bd.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que4==0){
					que4();
					count_que4=1;
					}else{
						bd.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	be.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que5==0){
					que5();
					count_que5=1;
					}else{
						be.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bf.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que6==0){
					que6();
					count_que6=1;
					}else{
						bf.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bg.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que7==0){
					que7();
					count_que7=1;
					}else{
						bg.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bh.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que8==0){
					que8();
					count_que8=1;
					}else{
						bh.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	bi.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				if(count_que9==0){
					que9();
					count_que9=1;
					}else{
						bi.disable();
					}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
	exit.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pa.setVisible(false);
			l3.setVisible(false);
			try {
				pa.setVisible(false);
				pb.setVisible(false);
				exit();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
}
private void exit() throws IOException{
	f.setLayout(new FlowLayout());
	JLabel final_score=new JLabel("Your final Score is: "+Score);
	final_score.setFont(new Font("Comic Sans MS",Font.BOLD,30));
	f.add(final_score);
}
private void que9() throws IOException{
	JLabel countdownText8=new JLabel();
	countdownText8.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText8.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 9");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>You are on a game show. You are shown three closed doors. A prize is hidden behind one, and the game show host knows where it is. You are asked to select a door. You do. Before you open it, the host opens one of the other doors, showing that it is empty, then asks you if you'd like to change your guess. Should you, should you not, or doesn't it matter?</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText8,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds8>0)				
			{
				seconds8--;
				countdownText8.setText("Now its :" + seconds8);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText8.setText("Now its :" + seconds8);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("43")){
				Score=Score+(Integer.parseInt(Bid))*5;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que8() throws IOException{
	JLabel countdownText7=new JLabel();
	countdownText7.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText7.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 8");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>A fast food restaurant sells chicken in orders of 6,9, and 20.<br> What is the largest number of pieces of chicken you cannot order from this restaurant?</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText7,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds7>0)				
			{
				seconds7--;
				countdownText7.setText("Now its :" + seconds7);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText7.setText("Now its :" + seconds7);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("43")){
				Score=Score+(Integer.parseInt(Bid))*5;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que7() throws IOException{
	JLabel countdownText6=new JLabel();
	countdownText6.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText6.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 7");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>You have been given the task of transporting 3,000 apples 1,000 miles from Appleland to Bananaville. Your truck can carry 1,000 apples at a time. Every time you travel a mile towards Bananaville you must pay a tax of 1 apple but you pay nothing when going in the other direction (towards Appleland).What is highest number of apples you can get to Bananaville?</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText6,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds6>0)				
			{
				seconds6--;
				countdownText6.setText("Now its :" + seconds6);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText6.setText("Now its :" + seconds6);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("833")){
				Score=Score+(Integer.parseInt(Bid))*5;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que6() throws IOException{
	JLabel countdownText5=new JLabel();
	countdownText5.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText5.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 6");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>A bunch of people are living on an island with '17' blue eyed people among them, when a visitor comes with a strange order: <br> All blue-eyed people must leave the island as soon as possible. There will<br>be a flight out at 8:00pm every evening. Each person can see everyone else's<br>eye color, but they do not know their own (nor is anyone allowed to tell them).<br>Additionally, they do not know how many people have blue eyes, although they<br>do know that at least one person does. How many days will it take the blue-eyed<br>people to leave?<br></body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText5,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds5>0)				
			{
				seconds5--;
				countdownText5.setText("Now its :" + seconds5);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText5.setText("Now its :" + seconds5);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("1 4")){
				Score=Score+(Integer.parseInt(Bid))*5;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que5() throws IOException{
	JLabel countdownText4=new JLabel();
	countdownText4.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText4.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 5");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>Letters A to I is categorized into 4 groups. Assume the font we used here is Arial. <br>Which group does the letter J belong to?  <br>Which group does the letter O belong to?<br><br>1. F  G<br>2. B  C  D  E<br>3. A<br>4. H  I</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText4,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds4>0)				
			{
				seconds4--;
				countdownText4.setText("Now its :" + seconds4);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText4.setText("Now its :" + seconds4);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("1 4")){
				Score=Score+(Integer.parseInt(Bid))*3;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que4() throws IOException{
	JLabel countdownText3=new JLabel();
	countdownText3.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText3.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 4");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>Find the four-digit number designated by asterisks, given the following:<br><br><li>All four digits of the unknown number are different.</li><br><li>None of the digits is zero.</li><br><li>Each '0' on the right of each four-digit number below indicates that the number has a matching digit in a non-matching position with the unknown number.</li><br><li>Each '+' on the right of each four-digit number below indicates that the number has a matching digit in a matching position with the unknown number.</li><pre>6152    +0<br>4182    00<br>5314    00<br>5789     +<br>-------------<br>****<br></pre></body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText3,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds3>0)				
			{
				seconds3--;
				countdownText3.setText("Now its :" + seconds3);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText3.setText("Now its :" + seconds3);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("13112221")){
				Score=Score+(Integer.parseInt(Bid))*2;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que3() throws IOException{
	JLabel countdownText2=new JLabel();
	countdownText2.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText2.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/num.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 3");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'><li>Find a 10-digit number, where the first figure defines the count of zeros in this number, the second figure the count of numeral 1 in this number etc. At the end the tenth numeral character expresses the count of the numeral 9 in this number.</li><br><br><li>Find a 10-digit number, where the first numeral character expresses the count of numeral 1 in this number, ..., the tenth numeral the count of zeros in this number.</li></body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText2,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds2>0)				
			{
				seconds2--;
				countdownText2.setText("Now its :" + seconds2);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText2.setText("Now its :" + seconds2);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			if(Answer.equals("13112221")){
				Score=Score+(Integer.parseInt(Bid))*2;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});

}
private void que2() throws IOException {
	
	JLabel countdownText1=new JLabel();
	countdownText1.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText1.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/black.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 2");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>1)Expect the next number in the following sequence<br><br>1, 11, 21, 1211, 111221, 312211</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText1,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	
	Timer timer =new Timer(1000,new ActionListener(){
		

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds1>0)				
			{
				seconds1--;
				countdownText1.setText("Now its :" + seconds1);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText1.setText("Now its :" + seconds1);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if ((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
		
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			
			if(Answer.equals("13112221")){
				Score=Score+(Integer.parseInt(Bid))*2;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			pan3();
			
		}
		
	});
	
}
private void que1() throws IOException{
	
	JLabel countdownText=new JLabel();
	countdownText.setFont(new Font("Georgia",Font.ITALIC,30));	
	countdownText.setForeground(Color.white);
	f.setLayout(new BorderLayout());
	BufferedImage img = ImageIO.read(getClass().getResourceAsStream("/images/blue2.jpg"));
	JLabel b=new JLabel(new ImageIcon(img));
	b.setPreferredSize(new Dimension(1,2));
	b.setMinimumSize(new Dimension(2,2));
	f.add(b);
	b.setLayout(new GridBagLayout());
	JLabel lq1_1=new JLabel("QUESTION No.: 1");
	lq1_1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
	lq1_1.setForeground(Color.white);
	JPanel pq1=new JPanel();
	pq1.setOpaque(false);
	JPanel pq2=new JPanel();
	pq2.setOpaque(false);
	JPanel pq3=new JPanel();
	pq3.setOpaque(false);
	JButton bidb=new JButton("Submit");
	bidb.setVisible(true);
	JButton ans=new JButton("Submit");
	pq2.setLayout(new GridBagLayout());
	GridBagConstraints gp=new GridBagConstraints();
	JLabel lq2_1=new JLabel("<html><body width='500px'>1) A lady sat next to a Mathematician in a plane. The lady gave him a question to find the ages of her three daughters by giving two following clues.:<br><br>(A) Product of their ages is 36.<br><br>(B) Sum of their ages is equal to Mathematician's seat number.<br><br> After some time Mathematician said that he requires one more clue to find out the exact answer and she says that her youngest daughter has BLUE EYES. Then he immediately says the ages of her three daughters.<br><br>What is the age of youngest daughter ??</body></html>");
	lq2_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq2_1.setForeground(Color.white);
	
	JLabel lq3_1=new JLabel("Bid: ");
	lq3_1.setFont(new Font("Georgia",Font.ITALIC,20));
	lq3_1.setForeground(Color.white);
	JTextField tf1_1=new JTextField(10);
	JTextField ta=new JTextField(10);
	tf1_1.setSize(200, 100);
	ta.setSize(200, 100);
	JLabel ls=new JLabel("Score: ");
	ls.setFont(new Font("Georgia",Font.ITALIC,20));
	ls.setForeground(Color.white);
	JLabel ls1=new JLabel(Integer.toString(Score));
	ls1.setFont(new Font("Georgia",Font.ITALIC,20));
	ls1.setForeground(Color.white);
	JLabel la=new JLabel("Answer: ");
	la.setFont(new Font("Georgia",Font.ITALIC,20));
	la.setForeground(Color.white);
	
	JLabel crct=new JLabel("Not Attempted");
	crct.setFont(new Font("Georgia",Font.ITALIC,20));
	crct.setForeground(Color.white);
	ImageIcon imageIcon = new ImageIcon("/images/crct.png");
    JLabel icon = new JLabel(imageIcon);
    icon.setIcon(imageIcon);
    icon.setForeground(Color.white);
    JButton MainMenu=new JButton("Main Menu");
    la.setVisible(false);
	ta.setVisible(false);
	ans.setVisible(false);
	g.gridx=1;g.gridy=1;g.gridwidth=3;
	b.add(pq1,g);
	g.gridx=1;g.gridy=2;
	b.add(pq2,g);
	g.gridx=1;g.gridy=3;
	b.add(pq3,g);
	pq1.setLayout(new GridBagLayout());
	gp.gridx=0;gp.gridy=0;
	pq1.add(MainMenu,gp);
	gp.gridx=2;gp.gridy=2;
	pq1.add(lq1_1,gp);
	gp.gridx=4;gp.gridy=1;gp.insets=new Insets(0,10,0,0);
	pq1.add(ls,gp);
	gp.gridx=5;gp.gridy=1;
	pq1.add(ls1,gp);
	pq2.setLayout(new BorderLayout());
	pq2.add(lq2_1,BorderLayout.CENTER);
	pq3.setLayout(new GridBagLayout());
	GridBagConstraints gp1=new GridBagConstraints();
	gp1.gridx=0;gp1.gridy=0;
	pq3.add(la,gp1);
	gp1.gridx=1;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ta,gp1);
	gp1.gridx=3;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(crct,gp1);
	gp1.gridx=2;gp1.gridy=0;gp1.insets=new Insets(0,10,0,0);
	pq3.add(ans,gp1);
	gp1.gridx=0;gp1.gridy=1;gp1.insets=new Insets(10,0,0,0);
	pq3.add(lq3_1,gp1);
	gp1.gridx=1;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(tf1_1,gp1);
	gp1.gridx=2;gp1.gridy=1;gp1.insets=new Insets(0,10,0,0);
	pq3.add(bidb,gp1);
	gp.gridx=6;gp.gridy=0;gp1.insets=new Insets(10,10,10,10);
	pq1.add(countdownText,gp);
	tf1_1.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent event) {
	 
	        String content = tf1_1.getText();
	        if (!content.equals("")) {
	            bidb.setEnabled(true);
	        } else {
	            bidb.setEnabled(false);
	        }
	    }
	});
	Timer timer =new Timer(1000,new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(seconds>0)				
			{
				seconds--;
				countdownText.setText("Now its :" + seconds);
			}else{
				tf1_1.disable();
				
			}	
		}	
	});
	timer.start();
	
	countdownText.setText("Now its :" + seconds);
	bidb.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Bid=tf1_1.getText();
			if((Integer.parseInt(Bid))<Score){
			la.setVisible(true);
			ta.setVisible(true);
			ans.setVisible(true);
			timer.stop();
		}
		}
	});
	ans.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Answer=ta.getText();
			
			if(Answer.equals("1")){
				Score=Score+(Integer.parseInt(Bid))*5;
				ls1.setText(Integer.toString(Score));
				crct.setText("Correct Answer!!");
				ta.disable();
			}else{
				Score=Score-(Integer.parseInt(Bid));
				ls1.setText(Integer.toString(Score));
				crct.setText("Wrong Answer!!");
				ta.disable();
			}
		}
		
	});
	MainMenu.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pq1.setVisible(false);
			pq2.setVisible(false);
			b.setVisible(false);
			f.revalidate();
			
			pan3();
			
		}
		
	});

}
 
public static void main(String []args){
	new Main();
}
} 
class button extends JButton {
	  public button(String label) {
	    super(label);

	    Dimension size = getPreferredSize();
	    size.width = size.height = Math.max(size.width, 
	      size.height);
	    setPreferredSize(size);
	    setContentAreaFilled(false);
	  }
	  protected void paintComponent(Graphics g) {
	    if (getModel().isArmed()) {
	      g.setColor(Color.lightGray);
	    } else {
	      g.setColor(Color.GRAY);
	    }
	    g.fillOval(0, 0, getSize().width-1, 
	      getSize().height-1);
	    super.paintComponent(g);
	  }
	  protected void paintBorder(Graphics g) {
	    g.setColor(getForeground());
	    g.drawOval(0, 0, getSize().width-1, 
	      getSize().height-1);
	  }
	  Shape shape;
	  public boolean contains(int x, int y) {
	    if (shape == null || 
	      !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(0, 0, 
	        getWidth(), getHeight());
	    }
	    return shape.contains(x, y);
	  }
}