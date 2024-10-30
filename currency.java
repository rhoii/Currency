import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount (USD dollar): ");
        double usd = scanner.nextDouble();

        double convRate = 55.840496;
        double php = usd * convRate;

        System.out.print("Amount in PHP is: " +php);
    }
    
}
