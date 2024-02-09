import java.util.ArrayList;

public abstract class Game {
	protected ArrayList<Card> deck = null;
	protected int toDeal = 0; // how many cards to deal to each player at the start
	protected int maxPlayers = 0; // how many players at most
	protected int minPlayers = 0; // how many players at least
	
	// The method returns all players' hands after the first deal
	public abstract ArrayList<ArrayList<Card>> deal();
	
	// The method shuffles the cards inside the game 
	public void shuffle() {
		// fill in the code
	}
		
	public void printDeck() {
		for(Card card: deck) {
			System.out.println(card);
		}
	}
}
