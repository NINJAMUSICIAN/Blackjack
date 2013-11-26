import java.util.ArrayList;
import java.awt.*;
import java.applet.*;
import java.io.File;
import javax.imageio.*;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Card {
	private String suit;
	private int card;
	private int value;
	private String face;
	private String suiter;
	private Image image;

	public Card(int card) {
		suit = this.suit;
		card = this.card;


		if (card <= 10) {
			value = card;
		} else {
			value = 10;
		}
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suite();
	}

	public void setCard(int card) {
		this.card = card;
	}

	public int getCard() {
		return card;
	}

	public String getCardName(){
		String name = " ";
		
		if(getCard() == 11 || getCard() == 24 || getCard() == 37 || getCard() == 50){
			name = "J";
		}else if(getCard() == 12 || getCard() == 25 || getCard() == 38 || getCard() == 51){
			name = "Q";
		}else if(getCard() == 13 || getCard() == 26 || getCard() == 39 || getCard() == 52){
			name = "K";

		}else if(getCard() == 1 || getCard() == 14 || getCard() == 27 || getCard() == 40){
			name = "A";
		}else{

			if(getCard() <= 10 && getCard() > 1){
			name = Integer.toString(getCard());
			}else if(getCard() > 13 && getCard() <= 23){
				name = Integer.toString(getCard() - 13);
			}else if(getCard() > 26 && getCard() <=36){
				name = Integer.toString(getCard() - 26);
			}else if(getCard() > 39 && getCard() <= 49){
				name = Integer.toString(getCard() - 39);
			}
		}
		return name;
	}

	public void cart(Card[] c){
		for(int i = 1; i < c.length; i++){
			setCard(i + 1);
		}
	}

	public String suite(){
		String suitString = null;
		if(card < 14){
			suitString = "Spades";
		}else if(card >= 14 && card <= 26){
			suitString = "Clubs";
		}else if(card > 26 && card <= 39){
			suitString = "Hearts";
		}else{
			suitString = "Diamonds";
		}

		return suitString;

	}

	public String getFace() {
		String face = null;
		if(card == 0){
		face = "your";
		}
		return face;
	}

	public void paint(Graphics g){

	}

}