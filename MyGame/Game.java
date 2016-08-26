import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Game extends Applet implements ActionListener {
	
	Button squares []; 
	Button newGameButton; 
    Label score; 
	int emptySquaresLeft=9; 
	public void init(){ 
		
		this.setLayout(new BorderLayout()); 
	  	this.setBackground(Color.red); 
	  	
		Font appletFont=new Font("Monospased",Font.BOLD, 20); 
		this.setFont(appletFont); 
		newGameButton = new Button("Нова гра");
		newGameButton.addActionListener(this);
		
		
		Panel topPanel = new Panel();
		topPanel.add(newGameButton);
		 this.add(topPanel, "north");
		 
		 Panel centerPanel =new Panel ()	;
		 centerPanel.setLayout(new GridLayout(3,3));
		 this.add(centerPanel,"center");
		 
		 score =new Label ("Твая черга");
		 this.add(score, "south");
		 
		 squares = new Button [9];
		 for (int i=0; i<9 ;i++){
			 squares[i] = new Button();
			 squares[i].addActionListener(this);
			 squares[i].setBackground(Color.GREEN);
			 centerPanel.add(squares[i]);
		 }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button theButton = (Button) e.getSource();
		
		if (theButton == newGameButton){
			for (int i=0; i<9; i++){
				squares[i].setEnabled(true);
				squares[i].setLabel("");
				squares[i].setBackground(Color.ORANGE);
			}
			
		}
		// TODO Auto-generated method stub
	
		
	}
	

	}
	
	


