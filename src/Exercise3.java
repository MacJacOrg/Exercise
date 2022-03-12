import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą");
        int a = userInput.nextInt();

        System.out.println("Podaj drugą licznę całkowitą");
        int b = userInput.nextInt();

        double addition_result = a + b;
        System.out.println("a = " + a +", b = " + b +", wynik to " + addition_result);

        double subtraction_result = a - b;
        System.out.println("a = " + a +", b = " + b +", wynik to " +subtraction_result);

        double multiplication_result = a * b;
        System.out.println("a = " + a +", b = " + b +", wynik to " + multiplication_result);

        double division_result = a / b;
        System.out.println("a = " + a +", b = " + b +", wynik to " + division_result);

        double power_result = Math.pow(a, b);
        System.out.println("a = " + a + ", podniesione do potęgi " + b +", daje nam " + power_result);

    }
}
