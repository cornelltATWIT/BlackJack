
public class Card {
	
	private int value;
	private String card;
	private boolean isFlipped=false;
	
	public Card( int v , String s ) {
		this.value=v;
		this.card=s; 
	}

	public String toString() {
		String output;
		if(isFlipped) {
			output=String.format("XX");
		}
		else {
			output=String.format("%s", this.card);
		}
		return output;
	}
		
	public int getValue() {
		return value;
	}

	public boolean isFlipped() {
		return this.isFlipped;
	}
	public void flip() {
		this.isFlipped=! this.isFlipped;
	}
	}


