import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args){
        System.out. println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'.");
        int wins=0;
        int losses=0;
        while(true) {



            Scanner input = new Scanner(System.in);
            String myMove =input.nextLine();
            if(myMove.equals("x")) {
                break;
            }

            if(!myMove.equals("r") && !myMove.equals("p") && !myMove.equals("s")) {
                System.out.println("Your move isn't valid!");
            } else {
                int rand = (int)(Math.random()*3);
                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "r";
                } else if(rand == 1) {
                    opponentMove = "p";
                } else {
                    opponentMove = "s";
                }

                System.out.println("Opponent move: " + opponentMove);

                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("r") && opponentMove.equals("s")) || (myMove.equals("s") && opponentMove.equals("p")) || (myMove.equals("p") && opponentMove.equals("r"))) {
                    System.out.println("You won!");
                    wins++;

                } else {
                    System.out.println("You lost!");
                    losses++;

                }
                System.out.println("Wins: "+wins);
                System.out.println("Loses: "+losses);
                System.out.print(System.lineSeparator());
            }

        }


        System.out.println("Thanks for playing Rock, Paper, Scissors!");

    }
}

