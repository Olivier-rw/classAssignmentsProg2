// By Olivier Nshimiyimana

public class Deck {
    // Start with your fields
    int size;
    Card [] cards;

    // Define your constructor
    Deck(){
//        Initialization of fields with default values.
        size = 0;
        cards = new Card[52];

//        These arrays of cards and suits help us in creating Card objects to add in our cards array
        String [] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String [] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

//        creating an object for each suit with each value & incrementing our size variable
        for (String suit: suits) {
            for (String value: values) {
                cards[size] = new Card(value, suit);
                size ++;
            }
        }
    }

//    display method print n first elements of the array.
    public void display(int n){
        if (n < cards.length){
            for (int iterator=0; iterator<n; iterator++){
                System.out.println(cards[iterator]);
            }
        }
    }

//    This function do the shuffling of deck by looping over each card and finding a random card in deck to swap with.
    public void shuffle(){
        for (int iterator=0; iterator<cards.length; iterator++){
//            get a random index to swap with
            int randomIndex = randomWithRange(0, cards.length-1);

//            swapping
            Card temp = cards[randomIndex];
            cards[randomIndex] = cards[iterator];
            cards[iterator] = temp;
        }
    }

//    Function to generate a random integer in a range.
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }


    public static void main(String[] args) {

        /*
            Deck testDeck = new Deck();
            // By default, your deck should create all 52 cards in the following order:
            // You should start from Ace, 2, 3, 4, 5 ... All the way to King
            // This should happen for Hearts, Spades, Diamonds, and clubs

            // This should print 52, as there are 52 cards in a given deck
            System.out.println(testDeck.size);

            // This should print the first 5 cards of the deck, based on the instructions above,
            // This should print Ace of hearts, 2 of hearts, 3 of hearts, 4 of hearts, then 5 of hearts.
            testDeck.display(5);

            // This method should swap the location of cards randomly.
            // We've used random behavior before in our code, for this time around, I'll refer you to
            // a great Stack overflow answer for a few ways of doing that in Java
            // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

            testDeck.shuffle();

            //This time, displaying the first few cards will be random
            testDeck.display(5);
            */
    }
}
