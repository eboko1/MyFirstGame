import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;;
public class TicTacToe extends Applet implements ActionListener{
	
Button squares [];
Button newGameButton;
Label score;
int emptySquaresLeft=9;

/*
* ����� init � ��� ����������� �������
*/
public void init(){
//������������� �������� ������������ �������, ����� � ����
	this.setLayout(new BorderLayout());
	this.setBackground(Color.CYAN);
	// �������� ����� ������� ���, ����� �� ��� ������
	// � ���� ������ 20
	Font appletFont=new Font("Monospased",Font.BOLD, 20);
	this.setFont(appletFont);
	// ������� ������ �New Game� � ������������ � ���
	// ��������� ��������
	

