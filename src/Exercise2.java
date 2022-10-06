import java.util.Scanner;

public class Exercise2 {
    final static int AMOUNT_OF_NUMBERS= 10;
    public static void main (String[] args){
        calculateAverage();
    }

    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[AMOUNT_OF_NUMBERS];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        int average = sum / numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (average < numbers[i]) {
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    }
