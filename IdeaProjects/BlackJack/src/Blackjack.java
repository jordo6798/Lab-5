import java.util.*;


public class Blackjack {
        public static void main (String args[]){
            Scanner scnr = new Scanner(System.in);
            P1Random rng = new P1Random();
            int game = 0;
            int x = 0;
            int y = 0;
            int option = 1;
            int card = 0;
            int over = 0;
            int playerwins = 0;
            int dealerwins = 0;
            int value = 0;
            double wins = 0;
            int ties = 0;
            double percentage = 0;


            while (option != 4) {
                option = 1;
                x = 0;
                game = game + 1;
                over = 1;
                System.out.println("START GAME #" + game);
                while (option != 4 && over == 1) {

                    if (option == 1) {
                        card = rng.nextInt(13) + 1;
                        if (card == 1) {
                            System.out.println("\nYour card is a ACE!");
                            value = card;
                            x = x + value;
                            System.out.println("Your hand is: " + x + "\n");
                        }
                        if (card > 1 && card < 11) {
                            System.out.println("\nYour card is a " + card + "!");
                            value = card;
                            x = x + value;
                            System.out.println("Your hand is: " + x + "\n");
                        }
                        if (card == 11) {
                            System.out.println("\nYour card is a JACK!");
                            value = 10;
                            x = x + value;
                            System.out.println("Your hand is: " + x + "\n");
                        }
                        if (card == 12) {
                            System.out.println("\nYour card is a QUEEN!");
                            value = 10;
                            x = x + value;
                            System.out.println("Your hand is: " + x + "\n");
                        }
                        if (card == 13) {
                            System.out.println("\nYour card is a KING!");
                            value = 10;
                            x = x + value;
                            System.out.println("Your hand is: " + x + "\n");
                        }
                    }
                    if (x == 21) {
                        System.out.println("BLACKJACK! You win!\n");
                        playerwins = playerwins + 1;
                        wins = wins + 1;
                        over = 0;
                    }
                    if (x > 21) {
                        System.out.println("You exceeded 21! You lose.\n");
                        dealerwins = dealerwins + 1;
                        over = 0;
                    }
                    if (option == 2) {
                        y = rng.nextInt(11) + 16;
                        System.out.println("\nDealer's hand: " + y);
                        System.out.println("Your hand is: " + x + "\n");
                        if (y > 21 || x > y) {
                            System.out.println("You win!\n");
                            playerwins = playerwins + 1;
                            wins = wins + 1;
                            over = 0;
                        }
                        if (x == y) {
                            System.out.println("It's a tie! No one wins!\n");
                            ties = ties + 1;
                            over = 0;
                        }
                        if (y > x && y <= 21) {
                            System.out.println("Dealer wins!\n");
                            dealerwins = dealerwins + 1;
                            over = 0;
                        }

                    }
                    if (option == 3) {
                        System.out.println("\nNumber of Player wins: " + playerwins);
                        System.out.println("Number of Dealer wins: " + dealerwins);
                        System.out.println("Number of tie games: " + ties);
                        System.out.println("Total # of games played is: " + (game - 1));
                        percentage = (wins / (game - 1)) * 100;
                        System.out.print("Percentage of Player wins: ");
                        System.out.print(String.format("%.1f", percentage));
                        System.out.print("%\n\n");
                    }
                    if (over == 1) {


                        System.out.println("1. Get another card");
                        System.out.println("2. Hold hand");
                        System.out.println("3. Print statistics");
                        System.out.println("4. Exit\n");
                        System.out.print("Choose an option: ");
                        option = scnr.nextInt();
                        while (option != 1 && option != 2 && option != 3 && option != 4) {
                            System.out.println("\nInvalid input!\n" + "Please enter an integer value between 1 and 4.\n");
                            System.out.println("1. Get another card");
                            System.out.println("2. Hold hand");
                            System.out.println("3. Print statistics");
                            System.out.println("4. Exit\n");
                            System.out.print("Choose an option: ");
                            option = scnr.nextInt();

                        }
                    }


                }


            }

        }
    }



