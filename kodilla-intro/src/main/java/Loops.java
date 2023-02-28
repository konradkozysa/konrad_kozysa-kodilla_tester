import java.util.Random;

public class Loops {
    public static int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int getCountOfRandomNumbers(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result = sumNumbers(numbers);
        System.out.println(result);
        int max = 100;
        int count = getCountOfRandomNumbers(max);
        System.out.println(count);
    }
}
