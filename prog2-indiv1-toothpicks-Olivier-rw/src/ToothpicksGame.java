/*
    Olivier Nshimiyimana
 */

import java.util.Scanner;

// Implementation of the game starts here.

public class ToothpicksGame {

//    Three groups A, B, and C are declared globally to be accessed by all functions.
    public static int A = 3;
    public static int B = 3;
    public static int C = 3;

//    This string also hold the pile selected by player.
    public static String SELECTED_PILE;

//    Main function declaration
    public static void main(String[] args) {

        /*
            Scanning user inputs to get players names.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the first player: ");
        String playerOne = input.next();

        System.out.println("Enter the name of the second player: ");
        String playerTwo = input.next();

//        This variable helps us to switch between two players
        int iterator = 0;

//        This loops until all piles are empty
        while (A != 0 || B != 0 || C != 0) {

//            Dividing iterator by two, always gives two results, which we are using to switch players.
            if (iterator % 2 == 0){
                toothpickSelect(playerOne);
            }
            else {
                toothpickSelect(playerTwo);
            }

//            After each pick of a given player, below function will print the state of the game.
            stateOfTheGame();

            iterator = iterator + 1; // Incrementing our iterator.
        }

//        'iterator' % 2, help our program to know the player who picked the last toothpick(s)
        if (iterator % 2 == 0){
            System.out.println(playerTwo + " picked up the last toothpick, " + playerOne + " has won!");
        }
        else {
            System.out.println(playerOne + " picked up the last toothpick, " + playerTwo + " has won!");
        }
    }

    /*
        The function below make our players selects number of toothpicks of their choice.
        It performs this to a pile selected by user, which it gets from the return value of 'selectedGroup()' function.
    */
    public static void toothpickSelect(String player) {

//        Getting number of toothpicks from the pile selected by user.
        int available_picks = selectedGroup(player);

        Scanner input = new Scanner(System.in);

        System.out.println(player + ", how many toothpicks are you picking from pile " + SELECTED_PILE + "?:");

        while (true) {
            int picked_toothpicks = input.nextInt();


//            Checking if number of toothpicks selected is in right range
            if (picked_toothpicks <= available_picks && picked_toothpicks > 0) {

//                Reducing global variables for toothpicks piles according to the selected pile.

                if (SELECTED_PILE.equals("A")) {
                    A = A - picked_toothpicks;
                }
                else if (SELECTED_PILE.equals("B")) {
                    B = B - picked_toothpicks;
                }
                else if (SELECTED_PILE.equals("C")) {
                    C = C - picked_toothpicks;
                }

                System.out.println("Taking " + picked_toothpicks + " from " + SELECTED_PILE);

//                Since our loop never ends, this break will make it stop when the right number of toothpicks is selected.
                break;

            }

//            If number of toothpicks is less than 1 or greater than available toothpicks, we keep asking for a valid input.
            else {
                System.out.println("You can only select 1 to " + available_picks + " from this pile");
            }
        }

    }

//    Function below make a given player select the pile he wants to pick toothpicks from.
    public static int selectedGroup(String player) {

        Scanner input = new Scanner(System.in);

        System.out.println(player + ", choose a non empty pile to pick toothpick(s) from:");

        while (true){

            SELECTED_PILE = input.nextLine();

//            It returns the variable corresponding to the selected pile.
            if (SELECTED_PILE.equals("A")) {
                return A;
            }
            else if (SELECTED_PILE.equals("B")) {
                return B;
            }
            else if (SELECTED_PILE.equals("C")) {
                return C;
            }

//            If player's input is not valid, we keep asking them for a valid input.
            else {
                System.out.println(player + ", the pile " + SELECTED_PILE + " you selected does not exist.");
                System.out.println("Please select the right group between 'A'. 'B', or 'C'");
            }

        }

    }

//    This print the state of the game using global variables for each pile
    public static void stateOfTheGame() {
        System.out.println("*******************************");
        System.out.println("# of toothpicks in pile A: " + A);
        System.out.println("# of toothpicks in pile B: " + B);
        System.out.println("# of toothpicks in pile C: " + C);
        System.out.println("*******************************");
    }

}
