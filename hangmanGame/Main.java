public class Main {

    public static void main(String[] args) {
        HiddenWordGenerator hiddenWordGenerator = new HiddenWordGenerator();
        HiddenWordLibrary hiddenWordLibrary = new HiddenWordLibrary();
        HangManStages hangManStages = new HangManStages();
        Game game = new Game(hangManStages, hiddenWordGenerator);
        game.startGame();

        System.out.println("Thanks for playing!");
    }
}
