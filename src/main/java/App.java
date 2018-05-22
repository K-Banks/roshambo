import models.Roshambo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean exit = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Roshambo newRoshambo = new Roshambo();

        while (exit) {
            try {
                System.out.println("Hello, lets play Roshambo. Please enter how you would like to play: 1 player, 2 player, exit");
                String userInput = bufferedReader.readLine();
                boolean playing = true;
                while(playing){
                    if (userInput.equals("2 player")) {
                        System.out.println("PLAYER 1, please enter your choice: r, s ,p or type 'exit' to quit");
                        String player1Input = bufferedReader.readLine();
                        System.out.flush();
                        if(player1Input.equals("exit")){
                            playing = false;
                        }else {
                            System.out.println("PLAYER 2, please enter your choice: r, s ,p");
                            String player2Input = bufferedReader.readLine();
                            String answer = newRoshambo.comparePlayers(player1Input, player2Input);
                            System.out.println("Player 1 chose: " + player1Input);
                            System.out.println("Player 2 chose: " + player2Input);
                            System.out.println(answer);
                        }

                    } else if (userInput.equals("1 player")) {

                        System.out.println("PLAYER 1, please enter your choice: r, s ,p or type 'exit' to quit");
                        String player1Input = bufferedReader.readLine();
                        if(player1Input.equals("exit")){
                            playing = false;
                        }else{
                            String computerInput = newRoshambo.getRandom();
                            String answer = newRoshambo.comparePlayers(player1Input, computerInput);
                            System.out.println("Player 1 chose: " + player1Input);
                            System.out.println("The computer (player 2) chose: " + computerInput);
                            System.out.println(answer);
                        }

                    } else if (userInput.equals("exit")) {
                        exit = false;
                        playing = false;
                    } else {
                        System.out.println("Sorry, I do not recognize that command.");
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
