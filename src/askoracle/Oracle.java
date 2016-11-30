package askoracle;
/**
 * Created by Cody Rose on 11/29/2016.
 */
import java.util.Scanner;
public class Oracle {
    private String oldAnswer = "The answer is in your heart.";
    private String newAnswer;
    private String question;

    public void chat() {
        System.out.println("I am the oracle!");
        System.out.println("I will answer any one-line question.");
        Scanner keyboard = new Scanner(System.in);
        String responce;
        do {
            answer();
            System.out.println("\nDo you with to ask another question?");
            responce = keyboard.next();
        } while (responce.equalsIgnoreCase("yes"));
        System.out.println("The oracle will now rest...");
    }

    private void answer() {
        System.out.println("What is your question?");
        Scanner keyboard = new Scanner(System.in);
        question = keyboard.nextLine();
        seekAdvice();
        System.out.println("You asked the question:");
        System.out.println(" " + question);
        System.out.println("Now hear is my answer:");
        System.out.println(" " + oldAnswer);
        update();
    }

    private void seekAdvice() {
        System.out.println("Hmm, I need some help on that.");
        System.out.println("Please give me one line of advice.");
        Scanner keyboard = new Scanner(System.in);
        newAnswer = keyboard.nextLine();
        System.out.println("Thank you that helped a lot.");
    }

    private void update()
    {
        oldAnswer = newAnswer;
    }
}
