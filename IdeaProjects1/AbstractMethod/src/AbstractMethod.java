public class AbstractMethod{

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateHighScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score "+highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int highScore = calculateHighScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score "+highScore);

    }


}