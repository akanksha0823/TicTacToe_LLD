import mode.ConsolePrint;
import model.Board;
import model.Player;
import service.TicTacToeService;
import validations.GameValidator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Board board =  new Board(3);

        Player player1 = new Player("Player1",1,"O");
        Player player2 = new Player("Player2",2,"X");

        List<Player> players = Arrays.asList(player1, player2);
        GameValidator gameValidator = new GameValidator(board);
        TicTacToeService ticTacToeService = new TicTacToeService(board, players, gameValidator, new ConsolePrint());

        while(true){
            System.out.println("Choose Input 1: play 2: Exit");

            Scanner sc=new Scanner(System.in);
            int option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Please Enter Your ID");
                    Player player = players.get(sc.nextInt()-1);
                    System.out.println("Enter Your Move X and Y");
                    ticTacToeService.input(sc.nextInt(),sc.nextInt(),player);
                    break;
                case 2: System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}