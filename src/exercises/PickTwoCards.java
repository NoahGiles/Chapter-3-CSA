package exercises;

public class PickTwoCards {

	public static void main(String[] args) 
	{
		
		final int CARDS_IN_SUIT = 13;
		int myValue;
		int yourValue;
		int mySuitValue;
		int yourSuitValue;
		String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
		Cards myCard = new Cards();
		Cards yourCard = new Cards();
		
		
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		mySuitValue = ((int)(Math.random() * 4) % suits.length);
		yourSuitValue = ((int)(Math.random() * 4) % suits.length);
		
		myCard.setValue(myValue);
		myCard.setSuit(suits[mySuitValue]);
		yourCard.setValue(yourValue);
		yourCard.setSuit(suits[yourSuitValue]);
		
		System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
		
		System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());
		
	}
}
