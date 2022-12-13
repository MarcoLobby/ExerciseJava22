package it.DevelHope.ExerciseJava22;

/**
 * @author Marco Lo Bello
 * This class run the code with the main function using the methods to add the Hello Word, to get the full name and the function to print the 2 methods.
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("word ") + wordGames.getFullName("Marco", " Lo Bello"));
    }
}
