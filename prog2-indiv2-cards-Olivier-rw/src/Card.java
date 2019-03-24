// By Olivier Nshimiyimana

public class Card {
    // Fields initializations
    String cardValue;
    String cardSuit;

    // Definition of a constructor
    Card(String value, String suit){
        cardValue = value;
        cardSuit = suit;
    }

//    toString method implementation
    public String toString() {
        return cardValue + " of " + cardSuit;
    }

//    equalsTo implementation
    public boolean equals(Card cardToCompare){
//        returns true when both two comparison for suit & value are true.
        return cardSuit.equals(cardToCompare.cardSuit) && cardValue.equals(cardToCompare.cardValue);
    }

    public static void main(String[] args) {

        /*
        Card ace1 = new Card("Ace", "Hearts");
        Card ace2 = new Card("Ace", "Clubs");

        // This should display " Ace of hearts"
        System.out.println(ace1);
        // This should display " Ace of Clubs"
        System.out.println(ace2);

        Card ace3 = new Card("Ace", "Clubs");
        // This should display True
        System.out.println(ace2.equals(ace3));

        // This should display False
        System.out.println(ace1.equals(ace3));
        */

    }
}
