import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class WindowQuiz extends JFrame implements ActionListener{
	
	JLabel title = new JLabel();
	
	JLabel timer = new JLabel();
	
	JLabel timer_label = new JLabel();
	
	JLabel counter_label = new JLabel();
	
	JLabel questions_area = new JLabel();
	
	JButton first_button = new JButton();
	
	JButton second_button = new JButton();
	
	JButton third_button = new JButton();
	
	JButton fourth_button = new JButton();
	
    JLabel first_label = new JLabel();
	
	JLabel second_label = new JLabel();
	 
	JLabel third_label = new JLabel();
	 
	JLabel fourth_label = new JLabel();

	JLabel counter = new JLabel();
	
	Border border1 = BorderFactory.createLineBorder(Color.DARK_GRAY,5);
	
	Border border2 = BorderFactory.createRaisedBevelBorder();
	
	int i=0;
	
	int x=15;
	
	Cursor cursore = new Cursor(Cursor.CROSSHAIR_CURSOR);
	
	ImageIcon image0 = new ImageIcon("JavaLogo.jpg");
	
	ImageIcon image1 = new ImageIcon("PythonLogo.png");
	
	ImageIcon image2 = new ImageIcon("CLogo.jpg");
	
	ImageIcon image3 = new ImageIcon("JavaScriptLogo.png");
	
	public WindowQuiz(){
		
		this.setLayout(null);
		
		title.setBounds(0,0,505,60);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.DARK_GRAY);
		title.setForeground(Color.green);
		title.setFont(new Font("BankGothic Md BT",Font.BOLD,50));
		title.setText("JAVA QUIZ");
		title.setOpaque(true);
		
		questions_area.setBounds(15,70,475,60);
		questions_area.setForeground(Color.white);
		questions_area.setBackground(Color.DARK_GRAY);
		questions_area.setText("1.When was Java born?");
		questions_area.setFont(new Font("BankGothic Md BT",Font.PLAIN,30));
		questions_area.setOpaque(true);
		
		first_button.setBounds(25,155,70,70);
		first_button.setText("A");
		first_button.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		first_button.setBackground(Color.DARK_GRAY);
		first_button.setForeground(Color.green);
		first_button.setBorder(BorderFactory.createCompoundBorder(border1,border2));
		first_button.setFocusable(false);
		first_button.addActionListener(this);
		
		first_label.setBounds(140,155,350,60);
		first_label.setText("1995");
		first_label.setForeground(Color.WHITE);
		first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		
		second_button.setBounds(25,250,70,70);
		second_button.setText("B");
		second_button.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		second_button.setBackground(Color.DARK_GRAY);
		second_button.setForeground(Color.green);
		second_button.setBorder(BorderFactory.createCompoundBorder(border1,border2));
		second_button.setFocusable(false);
		second_button.addActionListener(this);
		
		second_label.setBounds(140,250,350,60);
		second_label.setText("1998");
		second_label.setForeground(Color.WHITE);
		second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		
		third_button.setBounds(25,345,70,70);
		third_button.setText("C");
		third_button.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		third_button.setBackground(Color.DARK_GRAY);
		third_button.setForeground(Color.green);
		third_button.setBorder(BorderFactory.createCompoundBorder(border1,border2));
		third_button.setFocusable(false);
		third_button.addActionListener(this);
		
		third_label.setBounds(140,345,350,60);
		third_label.setText("1992");
		third_label.setForeground(Color.WHITE);
		third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		
		fourth_button.setBounds(25,440,70,70);
		fourth_button.setText("D");
		fourth_button.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		fourth_button.setBackground(Color.DARK_GRAY);
		fourth_button.setForeground(Color.green);
		fourth_button.setBorder(BorderFactory.createCompoundBorder(border1,border2));
		fourth_button.setFocusable(false);
		fourth_button.addActionListener(this);
		
		fourth_label.setBounds(140,440,350,60);
		fourth_label.setText("1990");
		fourth_label.setForeground(Color.WHITE);
		fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,40));
		
		
		counter_label.setBounds(5,530,230,25);
		counter_label.setHorizontalAlignment(JLabel.CENTER);
		counter_label.setBackground(Color.DARK_GRAY);
		counter_label.setForeground(Color.green);
		counter_label.setFont(new Font("BankGothic Md BT",Font.BOLD,30));
		counter_label.setText("Counter: ");
		counter_label.setOpaque(true);
		
		counter.setBounds(5,555,230,50);
		counter.setHorizontalAlignment(JLabel.CENTER);
		counter.setBackground(Color.DARK_GRAY);
		counter.setForeground(Color.green);
		counter.setFont(new Font("BankGothic Md BT",Font.BOLD,30));
		counter.setText(i+"/10");
		counter.setOpaque(true);
		
		timer_label.setBounds(268,530,230,25);
		timer_label.setHorizontalAlignment(JLabel.CENTER);
		timer_label.setBackground(Color.DARK_GRAY);
		timer_label.setForeground(Color.green);
		timer_label.setFont(new Font("BankGothic Md BT",Font.BOLD,30));
		timer_label.setText("Timer: ");
		timer_label.setOpaque(true);
		
		timer.setBounds(268,555,230,50);
		timer.setHorizontalAlignment(JLabel.CENTER);
		timer.setBackground(Color.DARK_GRAY);
		timer.setForeground(Color.green);
		timer.setFont(new Font("BankGothic Md BT",Font.BOLD,30));
		timer.setText(""+x+"");
		timer.setOpaque(true);
		
		this.setCursor(cursore);
		this.add(title);
		this.add(questions_area);
		this.add(first_button);
		this.add(first_label);
		this.add(second_button);
		this.add(second_label);
		this.add(third_button);
		this.add(third_label);
		this.add(fourth_button);
		this.add(fourth_label);
		this.add(counter_label);
		this.add(counter);
		this.add(timer_label);
		this.add(timer);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.black);
		this.setSize(520,650);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
		start();
		
	}
	public void start(){
		while(x>0) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		x--;
		timer.setText(String.valueOf(x));
		if(x==0) {
			JOptionPane.showMessageDialog(null,"YOU LOSE,TIME OVER");
			System.exit(0);
		} 
	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(questions_area.getText()) {
		
		case "1.When was Java born?":
			if(e.getSource()==first_button) {
				int i=0;
				first_button.setBackground(Color.green);
				first_label.setBackground(Color.green);
				first_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				
			questions_area.setText("2.Who created Java?");
			first_label.setText("Bill Gates");
			second_label.setText("Steve Wozniak");
			third_label.setText("James Gosling");
			fourth_label.setText("Grace Hopper");
			x=15;
			timer.setText(String.valueOf(x));
			}else {
				first_button.setBackground(Color.GREEN);
				first_button.setForeground(Color.black);
				second_button.setBackground(Color.red);
				third_button.setBackground(Color.red);
				fourth_button.setBackground(Color.red);
				first_label.setBackground(Color.GREEN);
			    second_label.setBackground(Color.red);
			    third_label.setBackground(Color.red);
			    fourth_label.setBackground(Color.red);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			first_button.setBackground(Color.DARK_GRAY);
			first_label.setBackground(Color.BLACK);
			first_label.setOpaque(true);
			break;
			
		case "2.Who created Java?":
			if(e.getSource()==third_button) {
				int i=1;
				third_button.setBackground(Color.green);
				third_label.setBackground(Color.green);
				third_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				
			questions_area.setText("3.What does meaning the acronym OOP?");
			questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			first_label.setText("Object On Programming");
			first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
			second_label.setText("Object Oriented Programming");
			second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			third_label.setText("Opportunity Of Programming");
			third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
			fourth_label.setText("Object over Programming");
			fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
			x=15;
			timer.setText(String.valueOf(x));
			}else {
				first_button.setBackground(Color.red);
				first_button.setForeground(Color.green);
				second_button.setBackground(Color.red);
				third_button.setBackground(Color.green);
				fourth_button.setBackground(Color.red);
				first_label.setBackground(Color.red);
			    second_label.setBackground(Color.red);
			    third_label.setBackground(Color.green);
			    fourth_label.setBackground(Color.red);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			third_button.setBackground(Color.DARK_GRAY);
			third_label.setBackground(Color.BLACK);
			third_label.setOpaque(true);
			break;
			
		case "3.What does meaning the acronym OOP?":
	          
				if(e.getSource()==second_button) {
					int i=2;
					second_button.setBackground(Color.green);
					second_label.setBackground(Color.green);
					second_label.setOpaque(true);
					i++;
					counter.setText(String.valueOf(i)+"/10");
					
			    questions_area.setText("4.What does meaning the acronym JVM?");
			    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			    first_label.setText("Java Value Mean");
			    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
			    second_label.setText("Java Viral Machine");
			    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			    third_label.setText("Java Version Master");
			    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
			    fourth_label.setText("Java Virtual Machine");
			    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
			    x=15;
			    timer.setText(String.valueOf(x));
				}else {
					first_button.setBackground(Color.red);
					first_button.setForeground(Color.green);
					second_button.setBackground(Color.green);
					third_button.setBackground(Color.red);
					fourth_button.setBackground(Color.red);
					first_label.setBackground(Color.red);
				    second_label.setBackground(Color.green);
				    third_label.setBackground(Color.red);
				    fourth_label.setBackground(Color.red);
				    first_label.setOpaque(true);
				    second_label.setOpaque(true);
				    third_label.setOpaque(true);
				    fourth_label.setOpaque(true);
				    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
				    System.exit(0);
				}
				second_button.setBackground(Color.DARK_GRAY);
				second_label.setBackground(Color.BLACK);
				second_label.setOpaque(true);
				break;
				
		case "4.What does meaning the acronym JVM?":
	          
				if(e.getSource()==fourth_button) {
					int i=3;
					fourth_button.setBackground(Color.green);
					fourth_label.setBackground(Color.green);
					fourth_label.setOpaque(true);
					i++;
					counter.setText(String.valueOf(i)+"/10");
					
			    questions_area.setText("5.What was Java originally called?");
			    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			    first_label.setText("Javane");
			    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
			    second_label.setText("Duke");
			    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
			    third_label.setText("Oak");
			    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
			    fourth_label.setText("Jcoffee");
			    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
			    x=15;
			    timer.setText(String.valueOf(x));
				}else {
					first_button.setBackground(Color.red);
					first_button.setForeground(Color.green);
					second_button.setBackground(Color.red);
					third_button.setBackground(Color.red);
					fourth_button.setBackground(Color.green);
					first_label.setBackground(Color.red);
				    second_label.setBackground(Color.red);
				    third_label.setBackground(Color.red);
				    fourth_label.setBackground(Color.green);
				    first_label.setOpaque(true);
				    second_label.setOpaque(true);
				    third_label.setOpaque(true);
				    fourth_label.setOpaque(true);
				    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
				    System.exit(0);
				}
				fourth_button.setBackground(Color.DARK_GRAY);
				fourth_label.setBackground(Color.BLACK);
				fourth_label.setOpaque(true);
				break;
				
		case "5.What was Java originally called?":
	          
			if(e.getSource()==third_button) {
				int i=4;
				third_button.setBackground(Color.green);
				third_label.setBackground(Color.green);
				third_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				
		    questions_area.setText("6.What is the name of the java mascot?");
		    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    first_label.setText("Allan");
		    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
		    second_label.setText("Duke");
		    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    third_label.setText("Oakkie");
		    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
		    fourth_label.setText("Mimo");
		    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
		    x=15;
		    timer.setText(String.valueOf(x));
			}else {
				first_button.setBackground(Color.red);
				first_button.setForeground(Color.green);
				second_button.setBackground(Color.red);
				third_button.setBackground(Color.green);
				fourth_button.setBackground(Color.red);
				first_label.setBackground(Color.red);
			    second_label.setBackground(Color.red);
			    third_label.setBackground(Color.green);
			    fourth_label.setBackground(Color.red);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			third_button.setBackground(Color.DARK_GRAY);
			third_label.setBackground(Color.BLACK);
			third_label.setOpaque(true);
			break;
			
		case "6.What is the name of the java mascot?":
	          
			if(e.getSource()==second_button) {
				int i=5;
				second_button.setBackground(Color.green);
				second_label.setBackground(Color.green);
				second_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				
		    questions_area.setText("7.Which is the Java logo?");
		    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    
		    first_label.setText("");
		    first_label.setBounds(140,155,350,70);
		    first_label.setIcon(image0);
		    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
		    
		    second_label.setText("");
		    second_label.setBounds(140,250,350,70);
		    second_label.setIcon(image2);
		    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    
		    third_label.setText("");
		    third_label.setBounds(140,345,350,85);
		    third_label.setIcon(image1);
		    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
		    
		    fourth_label.setText("");
		    fourth_label.setBounds(140,440,350,70);
		    fourth_label.setIcon(image3);
		    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
		    x=15;
		    timer.setText(String.valueOf(x));
			}else {
				first_button.setBackground(Color.red);
				first_button.setForeground(Color.green);
				second_button.setBackground(Color.green);
				third_button.setBackground(Color.red);
				fourth_button.setBackground(Color.red);
				first_label.setBackground(Color.red);
			    second_label.setBackground(Color.green);
			    third_label.setBackground(Color.red);
			    fourth_label.setBackground(Color.red);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			second_button.setBackground(Color.DARK_GRAY);
			second_label.setBackground(Color.BLACK);
			second_label.setOpaque(true);
			break;
			
		case "7.Which is the Java logo?":			
			if(e.getSource()==first_button) {
				int i=6;
				first_button.setBackground(Color.green);
				first_label.setBackground(Color.green);
				first_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				
		    questions_area.setText("8.Which company created Java?");
		    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    first_label.setText("Java Company");
		    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
		    second_label.setText("Samsung");
		    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
		    third_label.setText("Sun Microsystems");
		    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
		    fourth_label.setText("Apple");
		    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
		    x=15;
		    timer.setText(String.valueOf(x));
			}else {
				first_button.setBackground(Color.green);
				first_button.setForeground(Color.black);
				second_button.setBackground(Color.red);
				third_button.setBackground(Color.red);
				fourth_button.setBackground(Color.red);
				first_label.setBackground(Color.green);
			    second_label.setBackground(Color.red);
			    third_label.setBackground(Color.red);
			    fourth_label.setBackground(Color.red);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			first_button.setBackground(Color.DARK_GRAY);
			first_label.setBackground(Color.BLACK);
			first_label.setOpaque(true);
			first_label.setIcon(null);
			second_label.setIcon(null);
			third_label.setIcon(null);
			fourth_label.setIcon(null);
			break;
			
	case "8.Which company created Java?":
          
		if(e.getSource()==third_button) {
			int i=7;
			third_button.setBackground(Color.green);
			third_label.setBackground(Color.green);
			third_label.setOpaque(true);
			i++;
			counter.setText(String.valueOf(i)+"/10");
			
	    questions_area.setText("9.How do you insert a SINGLE comment in Java?");
	    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,16));
	    first_label.setText("/*");
	    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
	    second_label.setText("//");
	    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
	    third_label.setText("/");
	    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
	    fourth_label.setText(">>");
	    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
	    x=15;
	    timer.setText(String.valueOf(x));
		}else {
			first_button.setBackground(Color.red);
			first_button.setForeground(Color.green);
			second_button.setBackground(Color.red);
			third_button.setBackground(Color.green);
			fourth_button.setBackground(Color.red);
			first_label.setBackground(Color.red);
		    second_label.setBackground(Color.red);
		    third_label.setBackground(Color.green);
		    fourth_label.setBackground(Color.red);
		    first_label.setOpaque(true);
		    second_label.setOpaque(true);
		    third_label.setOpaque(true);
		    fourth_label.setOpaque(true);
		    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
		    System.exit(0);
		}
		third_button.setBackground(Color.DARK_GRAY);
		third_label.setBackground(Color.BLACK);
		third_label.setOpaque(true);
		break;
		
	case "9.How do you insert a SINGLE comment in Java?":
        
		if(e.getSource()==second_button) {
			int i=8;
			second_button.setBackground(Color.green);
			second_label.setBackground(Color.green);
			second_label.setOpaque(true);
			i++;
			counter.setText(String.valueOf(i)+"/10");
			
	    questions_area.setText("10.Which operator can be used to compare two values?");
	    questions_area.setFont(new Font("BankGothic Md BT",Font.BOLD,14));
	    first_label.setText("><");
	    first_label.setFont(new Font("BankGothic Md BT",Font.BOLD,23));
	    second_label.setText("%");
	    second_label.setFont(new Font("BankGothic Md BT",Font.BOLD,19));
	    third_label.setText("=");
	    third_label.setFont(new Font("BankGothic Md BT",Font.BOLD,20));
	    fourth_label.setText("==");
	    fourth_label.setFont(new Font("BankGothic Md BT",Font.BOLD,22));
	    x=15;
	    timer.setText(String.valueOf(x));
		}else {
			first_button.setBackground(Color.red);
			first_button.setForeground(Color.red);
			second_button.setBackground(Color.green);
			third_button.setBackground(Color.red);
			fourth_button.setBackground(Color.red);
			first_label.setBackground(Color.red);
		    second_label.setBackground(Color.green);
		    third_label.setBackground(Color.red);
		    fourth_label.setBackground(Color.red);
		    first_label.setOpaque(true);
		    second_label.setOpaque(true);
		    third_label.setOpaque(true);
		    fourth_label.setOpaque(true);
		    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
		    System.exit(0);
		}
		second_button.setBackground(Color.DARK_GRAY);
		second_label.setBackground(Color.BLACK);
		second_label.setOpaque(true);
		break;
		
		
		case "10.Which operator can be used to compare two values?":
	        
			if(e.getSource()==fourth_button) {
				int i=9;
				fourth_button.setBackground(Color.green);
				fourth_label.setBackground(Color.green);
				fourth_label.setOpaque(true);
				i++;
				counter.setText(String.valueOf(i)+"/10");
				if(i==10) {
					Quiz_Finish finish = new Quiz_Finish();
					x=100000;
				    timer.setText(String.valueOf(x));
				}
			}else {
				first_button.setBackground(Color.red);
				first_button.setForeground(Color.red);
				second_button.setBackground(Color.red);
				third_button.setBackground(Color.red);
				fourth_button.setBackground(Color.green);
				first_label.setBackground(Color.red);
			    second_label.setBackground(Color.red);
			    third_label.setBackground(Color.red);
			    fourth_label.setBackground(Color.green);
			    first_label.setOpaque(true);
			    second_label.setOpaque(true);
			    third_label.setOpaque(true);
			    fourth_label.setOpaque(true);
			    JOptionPane.showMessageDialog(null,"YOU LOSE,WRONG ANSWER");
			    System.exit(0);
			}
			fourth_button.setBackground(Color.DARK_GRAY);
			fourth_label.setBackground(Color.BLACK);
			fourth_label.setOpaque(true);
			break;
	    }
	}
}