import java.util.Scanner;

public class school {


public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
        switch (i) {
            case 3:
                System.out.print(" ");
                break;

            default:
                System.out.print(i+" ");
        }
    }
    while (true) {

        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        if (input == 5) {break;}
    }
}


}
