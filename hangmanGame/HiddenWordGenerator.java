import java.util.Random;

public class HiddenWordGenerator {

    private Random rand = new Random();

    private int maxNum = 100;
    private int minNum = 0;
    
    public String generateRandomWord(int difficulty) {

        int randomWordPosition = rand.nextInt((maxNum - minNum) + 1) + minNum;
        return new HiddenWordLibrary().getWord(randomWordPosition, difficulty);
    }
}
