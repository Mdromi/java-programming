// java chapter-6/CardGames/Deck.java

package CardGames;

public class Deck {

    private final Card[] cards;
    private int cardsUsed;

    public Deck() {
        this.cards = new Card[52];
        initializeDeck();
    }

    private void initializeDeck() {
        int count = 0;

        // hearts
        for(int i = 1; i <=13; i++) {
            // cards[count++] = new Card(i, Suit.HEARTS)
        }
    }

    public static void main(String[] args) {
        
    }
}
