import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Initial balance: ");
        double balance = in.nextDouble();
        System.out.print("Annual interest rate in percent: ");
        double rate = in.nextDouble() / 1200;

        balance *= (1+rate);
        System.out.printf("After first month: %.2f\n", balance);
        balance *= (1+rate);
        System.out.printf("After second month: %.2f\n", balance);
        balance *= (1+rate);
        System.out.printf("After third month: %.2f\n", balance);
    }
}
