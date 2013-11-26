
import java.awt.*;
import java.applet.*;
import javax.imageio.*;
	
public class Table extends Applet{
	
	private Play play;

	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];

	public Table(){

	}

	public void init(){
		play = new Play();
		play.init();
		deck = play.populateDeck(deck);
		play.shuffleDeck(deck);
		play.printDeck(deck);
	}

	public void paint(Graphics g){
		play.draw(g);
	}

}