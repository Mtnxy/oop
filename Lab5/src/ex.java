import java.util.Arrays;

public class ex {
    public static int sum (int[] numbers) {
        System.out.println("number =" +Arrays.toString(numbers));
        numbers[0] = 20;
        return 0;
    }

    public static void main(String[] args) {
        int[] prices = {10,20,15};

        prices = new int;
        ex.sum(prices);
        System.out.println("prices =" +Arrays.toString(prices));
    }
}
