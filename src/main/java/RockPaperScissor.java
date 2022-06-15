import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        RockPaperScissor game = new RockPaperScissor();
        game.play();
    }
    void play() {
        Scanner sc = new Scanner(System.in);
        int user_win = 0;
        int computer_win = 0;
        int tie = 0;
        String answer;
        do{
            System.out.println("Enter the number of rounds you want to play");
            int rounds_count = sc.nextInt();
            if(rounds_count < 1 || rounds_count > 10) {
                System.out.println("Error: Invalid input");
                answer = "n";
                continue;
            }
            int[] rounds = new int[rounds_count];

            for (int i = 0; i < rounds_count; i++) {
                System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
                rounds[i] = Round(sc.nextInt());
                switch (rounds[i]) {
                    case 1:
                        user_win++;
                        break;
                    case -1:
                        computer_win++;
                        break;
                    case 0:
                        tie++;
                        break;
                    default:
                        break;
                }
            }

            //print the final result
            System.out.println("User won " + user_win + " times");
            System.out.println("Computer won " + computer_win + " times");
            System.out.println("You tied " + tie + " times");
            System.out.println();
            if (user_win > computer_win) {
                System.out.println("User won the game");
            } else if (user_win < computer_win) {
                System.out.println("Computer won the game");
            } else {
                System.out.println("The game is a tie");
            }
            System.out.println();
            System.out.println("Do you want to play again? (y/n)");
            answer = sc.next();
        }while (answer.equals("y"));
        System.out.println("Thanks for playing!");
    }

    int Round(int userChoice){
        //randomly generate computer choice
        int computerChoice = (int) (Math.random() * 3) + 1;
        //print computer choice
        System.out.println("Computer choice: " + computerChoice);
        //caulculate the winner
        System.out.println();
        return Result(userChoice, computerChoice);
    }

    int Result(int userChoice, int computerChoice) {
        if(userChoice - computerChoice == -1 || userChoice - computerChoice == 2) {
            System.out.println("You win");
            return 1;
        }
        else if(userChoice - computerChoice == 0) {
            System.out.println("Draw");
            return 0;
        }
        else{
            System.out.println("You lose");
            return -1;
        }
    }
}
