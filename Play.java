import java.util.Random;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

public class Play{
// 0-Clubs 1-Spades 2-Hearts 3-Diamonds
	public static Card[] deck = new Card[52];
	public static Card[] hand = new Card[11];

	private int xPlace = 0;

	private BufferedImage theCard = null;

	public Play(){
	}

	public void init() {
		deck = populateDeck(deck);
		shuffleDeck(deck);
		//printDeck(deck);
	}

	public static Card[] populateDeck(Card[] deck) {
		Card[] dek = new Card[deck.length];
		Card c;
		for (int i=0; i<52; i++){

			

				c = new Card(i);
				c.setCard(i + 1);
				c.setSuit(c.suite());

				dek[i] = c;
				
				
			
			
		}

		return dek;
	}

	public static void printDeck(Card[] deck) {
		for (int i=0; i<deck.length; i++) {
		
			System.out.println(deck[i].getCardName() + deck[i].getSuit());
		}
	}

	public static void shuffleDeck(Card[] deck){
		Random r = new Random();
		for(int i = deck.length - 1; i > 0; i--){
			int index = r.nextInt(i + 1);

			Card a = deck[index];
			      deck[index] = deck[i];
			      deck[i] = a;
		}
	}

	public int downHowMuch(int i){
		int y;
		if(i < 11){
			y = 100;
		}else if(i > 10 && i < 21){
			y = 200;
		}else if(i > 20 && i < 31){
			y = 300;
		} else if(i > 30 && i < 41){
			y = 400;
		}else if(i > 40 && i < 51){
			y = 500;
		}else{
			y = 600;
		}
		return y;
	}

	public void xAxis(int i){
		if(i % 10 == 0){
			xPlace = 0;
		}else if(i == 51){
			xPlace = 0;
		}else{
			xPlace += 100;
		}
	}

	public void draw(Graphics g){
		try{
		for(int i = 0; i < deck.length; i++){
			String card = "Cards" + File.separator + deck[i].getCardName() + deck[i].getSuit() + ".png";
			System.out.println(downHowMuch(i));
			theCard = ImageIO.read(new File(card));
			xAxis(i);
			g.drawImage(theCard, xPlace, downHowMuch(i), 100, 100,  null);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}