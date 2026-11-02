import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        HiddenWordGenerator hiddenWordGenerator = new HiddenWordGenerator();
        HiddenWordLibrary hiddenWordLibrary = new HiddenWordLibrary();
        HangManStages hangManStages = new HangManStages();
        Game game = new Game(hangManStages, hiddenWordGenerator);

        System.out.println("Welcome to Hangman!");
        Scanner in = new Scanner(System.in);
        int difficultyChoice = 0;
        while (difficultyChoice < 1 || difficultyChoice > 3) {
            System.out.println("Please enter a valid difficulty level (1-3): ");
            difficultyChoice = in.nextInt();
        }
        String hiddenWord = hiddenWordGenerator.generateRandomWord(difficultyChoice);
        
        game.startGame(hiddenWord);

        System.out.println("Thanks for playing!");
    }
}
