package playingGround;

public class InvestmentCalculator {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 0.07;
        int[] years = {10, 20, 30};

        for (int n : years) {
            double amount = principal * Math.pow(1 + rate, n);
            System.out.printf("After %d years, you'll have $%.2f\n", n, amount);
        }
    }
}

