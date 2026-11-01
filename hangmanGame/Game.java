import java.util.Scanner;

public class Game {
    public String guess;
    public Scanner in = new Scanner(System.in);
    public int difficultyChoice;
    public String hiddenWord;
    public HangManStages CurrentHangManStage;
    public HiddenWordGenerator hiddenWordGenerator;
    public String discoveredLetters = "";
    public String guessedLetters = "";
    int incorrectGuesses = 0;

    public Game(HangManStages hangManStages, HiddenWordGenerator hiddenWordGenerator) {
        this.CurrentHangManStage = hangManStages;
        this.hiddenWord = hiddenWordGenerator.generateRandomWord(difficultyChoice);
        this.hiddenWordGenerator = hiddenWordGenerator;
    }

    public void startGame() {
        System.out.println("Welcome to Hangman!");
        System.out.println("Enter difficulty (1-3): ");
        difficultyChoice = in.nextInt();
        hiddenWord = hiddenWordGenerator.generateRandomWord(difficultyChoice);

        //Test
        System.out.println(hiddenWord);
        printHiddenWord();

        while (!isGameOver()) {
            makeGuess();
        }

        if (isGameWon()) {
            System.out.println("Congratulations! You've guessed the word: " + hiddenWord);
        } else {
            System.out.println("Game over! The word was: " + hiddenWord);
        }
    }

    public void makeGuess() {
        System.out.println("Enter your guess: ");
        guess = in.next();
        discoverLetter(guess);
        printHiddenWord();
    }

    public void printHiddenWord() {
        for (int i = 0; i < hiddenWord.length(); i++) {
            char currentLetter = hiddenWord.charAt(i);
            if (discoveredLetters.indexOf(currentLetter) != -1) {
                System.out.print(currentLetter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public void discoverLetter(String guess) {
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == guess.charAt(0) && !discoveredLetters.contains(guess)) {
                discoveredLetters += guess.charAt(0);
                System.out.println("Correct guess!");
                System.out.println(CurrentHangManStage.getHangManStage(incorrectGuesses));
                if(!guessedLetters.contains(guess) && !discoveredLetters.contains(guess)) {
                    guessedLetters += guess;
                }
                System.out.println("Current incorrect guessed letters: " + guessedLetters);

            }
        }
        if (!hiddenWord.contains(guess)) {
            incorrectGuesses++;
            if(!guessedLetters.contains(guess) && !discoveredLetters.contains(guess)) {
                guessedLetters += guess;
            }
            
            System.out.println("Incorrect guess! You have " + (6 - incorrectGuesses) + " guesses left.");
            System.out.println(CurrentHangManStage.getHangManStage(incorrectGuesses));
            System.out.println("Current incorrect guessed letters: " + guessedLetters);
        }
    }

    public boolean isGameOver() {
        return incorrectGuesses == 6 || isGameWon();
    }

    public boolean isGameWon() {
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (discoveredLetters.indexOf(hiddenWord.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}