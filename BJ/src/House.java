import java.util.Scanner;

public class House extends GenericPlayer{
	public House() {
		super("House");
	}
	
	public boolean isHitting(Scanner s) {
		if(getValue() <16 && isBusted==false) {
			return true;
		}
		else {
			return false;
		}
	}
	public void flipFirstCard() {
		cards.get(0).flip();
	}
	}