import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Deck d = new Deck();
		
		System.out.printf("%nWelcome to BlackJack! %n%n");
		
		System.out.printf("How many players? %n");
		int numPlayers=input.nextInt();
		ArrayList<GenericPlayer> players= new ArrayList<>(numPlayers +1);
		
		for(int i=0; i<numPlayers; i++) {
			System.out.printf("Enter player #%d name:", i+1);
			String name= input.next();
			Player p = new Player(name);
			players.add(p);
		}
		House h = new House();
			players.add(h);
		
		for(int i=0; i<players.size(); i++) {
			GenericPlayer p= players.get(i);
			d.draw(p);
			d.draw(p);
			if(p instanceof House) {
				House house=(House) p;
				house.flipFirstCard();
			}
			System.out.printf("%s", p);
		}
		
		
		for(int i=0; i<players.size(); i++) {
			GenericPlayer p= players.get(i);
			if(p instanceof House) {
				House house=(House) p;
				house.flipFirstCard();
			}
			
			while(!p.isBusted()) {
				if(p.isHitting(input)) {
					d.draw(p);
					System.out.printf("%s", p);
				}
				else {
					break;
				}
				if(p.getValue()>21) {
					p.busted();
				}
			}
			
		}
			System.out.printf("%n%nFinal Hands: %n");
			for(int i=0; i<players.size(); i++) {
				GenericPlayer p= players.get(i);
				System.out.printf("%s", p);
			}
			System.out.printf("%n%n");
			
			
			int houseValue = h.getValue() ;
			for (int i =0; i < players.size(); i ++) {
			GenericPlayer p = players.get(i);
			if (p instanceof House) {
			continue;
			}
			// win condition checks
			if (!p.isBusted() && houseValue >21) {
			// player wins
			win();
			} else if (p.getValue() == houseValue && !p.isBusted()) {
			// player pushed
			p.pushed();
			} else if (!p.isBusted() && p.getValue() > houseValue) {
			// player wins
			p.wins();
			} else {
			// player lose
			p.lose();
			}
			}
		}
		}
	


