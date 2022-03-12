public class Methods {
    public static void main(String[] args){

        calculateScore(true,800,5,100);

        calculateScore(true,10000,8,200);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 2000;
            System.out.println("Your finalScore was = " + finalScore);
       return finalScore;
        }
     return -1; // -1 shows invalid value...
        }
    }