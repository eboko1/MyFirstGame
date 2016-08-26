import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;;
public class TicTacToe extends Applet implements ActionListener{
	
Button squares [];
Button newGameButton;
Label score;
int emptySquaresLeft=9;

/*
* ћетод init Ц это конструктор апплета
*/
public void init(){
//”станавливаем менеджер расположени€ апплета, шрифт и цвет
	this.setLayout(new BorderLayout());
	this.setBackground(Color.CYAN);
	// »змен€ем шрифт апплета так, чтобы он был жирным
	// и имел размер 20
	Font appletFont=new Font("Monospased",Font.BOLD, 20);
	this.setFont(appletFont);
	// —оздаем кнопку УNew GameФ и регистрируем в ней
	// слушатель действи€
	

