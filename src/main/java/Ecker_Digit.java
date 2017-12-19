import java.util.Scanner;

public class Ecker_Digit {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        long number;
        long digit = 0 ,help = 0;
        int countDigit = 0;

        System.out.println("Die Größte Zahl darf " + Long.MAX_VALUE + " sein");
        System.out.print("Zahl: ");
        number = scanner.nextLong();

        for (int i = 0; i < 10; i++){
            countDigit= 0;
            while (number > 0) {
                digit = number % 10;
                number /= 10;

                if (digit == i){
                    countDigit++;
                }
            }
            if (countDigit != 0){
                System.out.printf("Zieffer %d kommet %d mal vor \n", i, countDigit);
            }
            number = help;
        }
    }
}
