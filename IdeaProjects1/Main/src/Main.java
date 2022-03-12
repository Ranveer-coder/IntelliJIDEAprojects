public class Main {

    public static void main(String[] args) {
        boolean gameOver = true; // defined parameters for calculateScore method inside highScore method
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//method inside method
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score " + highScore);
//parameter's values are changed
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score " + highScore);

        // highScorePosition is a new method which calls calculateHighScorePostion and prints its postion coz the method is giving one parameter only
        //displayHighScorePostion is Another method which prints name and calls highScorePostion for positon displaying
        int highScorePosition = calculateHighScorePositon(1500);
        displayHighScorePositon("Tim", highScorePosition);

        highScorePosition = calculateHighScorePositon(500);
        displayHighScorePositon("r", highScorePosition);

        highScorePosition = calculateHighScorePositon(100);
        displayHighScorePositon("s", highScorePosition);

        highScorePosition = calculateHighScorePositon(50);
        displayHighScorePositon("t", highScorePosition);

    }
//displayHighScorePostion is called by main
    public static void displayHighScorePositon(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
    //calculateHighScorePostion is called by main
    public static int calculateHighScorePositon(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        }
//        if (playerScore >= 500) {
//            return 2;
//        }
//        if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
       int position = 4; //assuming pos will be 4

        if(playerScore>=1000){
            position =1;
      }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >=100){
            position = 3;
        }
        return position;

    }
//calculateScore is defined here as a static method and it was called by highScore inside main method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;

        }//could have written else here but this will be fine as well, return will be any way...
        return -1;
    }

}
