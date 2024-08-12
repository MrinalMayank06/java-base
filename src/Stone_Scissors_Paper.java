
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Stone_Scissors_Paper {
    public static void main(String[] args) {
        System.out.println("Stone  Paper Scissors Game!");
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Let's Play Stone  Paper Scissors Game");
        String PlayerChoice= sc.next().toLowerCase(Locale.ROOT);
        if (    !PlayerChoice.equals("rock")&&
                !PlayerChoice.equals("paper")&&
                !PlayerChoice.equals("scissors")){
            System.out.println("InvalidChoice. Please Choose 'rock' ,'paper', 'scissors'. ");
            sc.close();
            return;
        }
        int ComputerChoiceInt= rd.nextInt(3);
        String ComputerChoice = "    ";
        switch (ComputerChoiceInt) {
            case (1):

                ComputerChoice = "rock";
                break;

            case (2):
                ComputerChoice = "scissors";
                break;

            case (3):

                ComputerChoice = "paper";
                break;


        }

        System.out.println("ComputerChoice"+  ComputerChoice);
        System.out.println("your choice"+ PlayerChoice);
        if (PlayerChoice.equals(ComputerChoice)){
            System.out.println("Its a tie ");
        } else if (PlayerChoice.equals("rock") && ComputerChoice.equals("scissors") ||
                   PlayerChoice.equals("paper")&& ComputerChoice.equals("rock")||
                PlayerChoice.equals("scissors")&& ComputerChoice.equals("rock")) {
            System.out.println("You win");

        }
        else {
            System.out.println("computer is won the game");
        }
        sc.close();

    }
}
