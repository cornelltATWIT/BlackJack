import java.util.Scanner;

public abstract class GenericPlayer extends Hand{
	
	protected String name;
	protected boolean isBusted=false;
	
	protected GenericPlayer(String name) {
		super();
		this.name=name;
	}
	
	public abstract boolean isHitting(Scanner s);
	
	public boolean isBusted() {
		return this.isBusted;
	}
	
	public void busted() {
		System.out.printf("%s Busted !%n", name);
		isBusted=true;
	}
	public String toString() {
		return String.format("%s: %s", name, super.toString());
	}


		
	}

