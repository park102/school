import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class school {

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("low number of a range");
    Integer min = scan.nextInt();

    System.out.println("high number of a range");
    Integer max = scan.nextInt();
    
    int rand = ThreadLocalRandom.current().nextInt(min, max + 1);
    System.out.println("guess a number between " + min + " and " + max);
    
    boolean answer = false;
    while (!answer) {
        Integer guess = scan.nextInt();
            if (guess < rand) { System.out.println("number to small"); 
            } else if (guess > rand) { System.out.println("number to big");
            } else if (guess == rand) { answer = true; System.out.println("that is correct"); }

        }
    }
}
