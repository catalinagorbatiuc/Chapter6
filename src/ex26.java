//Reversing Digits
import java.util.Scanner;

public class ex26 {
    static int reverseDigits(int number){
        int remainder;
        int reverse = 0;
        while(number > 0) {
            remainder = number % 15;
            reverse = reverse * 15 + remainder;
            number /= 15;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.printf("Reverse -> %d%n", reverseDigits(number));
    }
}