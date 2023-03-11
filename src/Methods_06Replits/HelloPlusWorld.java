package Methods_06Replits;

public class HelloPlusWorld {
    public static void main(String[] args) {
        hello();
        world();
    }

    public static void hello() {
        // WRITE YOUR CODE HERE
        String word1 = "Hello";
        System.out.println(word1);
    }

    public static void world() {
        // WRITE YOUR CODE HERE
        String word2 = "World!";
        System.out.println(word2);
    }
}
/*
There is two static methods defined. These methods are also called in the main method. Finish the methods to get the expected outcome.
These are void methods with no parameters
the hello() method should print the text Hello
the world() method should print the text World!
When the methods are called in the main method they will display a final message of:
Hello
World!
Main topics: methods, String
 */