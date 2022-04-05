import java.util.ArrayList;

public abstract class CardCollection {
	protected ArrayList <Card> cards;

	protected CardCollection (int size) {
	 this.cards = new ArrayList < >(size);
	 }

	 public void addCard(Card c) {
	 cards.add(c);
	 }
	 
	 public void removeCard(Card c) {
	 cards.remove(c);
	 }
	 }

