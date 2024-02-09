
public class RegularCard implements Card {
	public static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King", "Ace"};
	private String suit;
	private String rank;
	
	
	public RegularCard(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// implement toString:
}
