public class Game {

    private int totalScore;

    public Game (int roll,int pinsHit){
        System.out.println(score(roll,pinsHit));
    }

    public int score(int roll,int pinsHit){
        for ( ;roll<2;roll++) {
            if (roll == 0 && pinsHit == 10) {
                totalScore += 20;
                break;
            }
            else if (roll == 1 && pinsHit == 10) {
                totalScore += pinsHit + 10;
            }else{
                totalScore += pinsHit;
            }
        }
        return totalScore;
    }
}
