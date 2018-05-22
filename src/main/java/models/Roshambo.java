package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Roshambo {

    public String comparePlayers(String player1Choice, String player2Choice) {
        Map<String, String> answerMap = new HashMap<String, String>();
        answerMap.put("rp", "Player 2 wins");
        answerMap.put("rs", "Player 1 wins");
        answerMap.put("pr", "Player 1 wins");
        answerMap.put("ps", "Player 2 wins");
        answerMap.put("sr", "Player 2 wins");
        answerMap.put("sp", "Player 1 wins");

        if(player1Choice.equals(player2Choice)){
            return "Draw";
        }else {
            String query = player1Choice + player2Choice;
            return answerMap.get(query);
        }



    }

    public String getRandom() {
        Random random = new Random();
        int computerChoice = random.nextInt(3);
        if(computerChoice == 0){
            return "r";
        } else if (computerChoice == 1){
            return "s";
        }else {
            return "p";
        }
    }
}
