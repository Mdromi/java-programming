// java chapter-6/CardGames/Card.java

package CardGames;

public class Card {
    public enum Suit {
        DIMONDS("\u2666"),
        HEARTS("\u2665"),
        CLUBS("\u2663"),
        SPADES("\u2660");

        private final String value;

        Suit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private final int value;
    private final Suit suit;

    public Card(int theValue, Suit theSuit) {
        this.value = theValue;
        this.suit = theSuit;
    }

    public int getValue() {
        return value;
    }

    public Suit geSuit() {
        return suit;
    }

    @Override
    public String toString() {
        // return suit + "" + getValueAsString();
        return "";
    }

    // public String getValueAsString() {
    //     return switch (value) {
    //         case 1 -> "Ace";
    //         case 2 -> "2";
    //         case 3 -> "3";
    //         case 4 -> "4";
    //         case 5 -> "5";
    //         case 6 -> "6";
    //         case 7 -> "7";
    //         case 8 -> "8";
    //         case 9 -> "9";
    //         case 10 -> "10";
    //         case 11 -> "Jack";
    //         case 12 -> "Queen";
    //         case default -> "King";
    //     }
    // }


    public static void main(String[] args) {
        
    }
}

