
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class school {

    public static void game_loop(Integer min,Integer max){
        Scanner scan = new Scanner(System.in);

        int rand = ThreadLocalRandom.current().nextInt(min, max + 1);
        int trys = 0;
        boolean answer = false;
        while (!answer) {
            System.out.print("guess a number between "+min+" and "+max+" ");
            Integer guess = scan.nextInt();
            if (guess < rand) { System.out.println(guess + " is to small"); 
            } else if (guess > rand) { System.out.println(guess + " is to big");
            } else if (guess == rand) { answer = true;
                System.out.println("You guessed right in %s tries! ".formatted(trys)); }
            trys ++;
        }
    }

public static void main(String[] args) {
   
    Scanner scan = new Scanner(System.in);
    System.out.print("what number would you like to use for the lower bound? ");
    Integer min = scan.nextInt();

    System.out.print("what number would you like to use for the upper bound? ");
    Integer max = scan.nextInt();
    boolean play = true;
    while(play){
        game_loop(min, max);
        System.out.println("play again? (y/n)");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("n")){play=false;}
        System.out.println(answer.substring(0,1));
        

    }
}
}
