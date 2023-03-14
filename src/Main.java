public class Main {


    private static void printSeparator() {
        System.out.println("==.==.==.==.==.==.==.==.==.==");
    }

    private static void printNumbers(int numberCount) {
        System.out.println(numberCount);
    }

    public static int sum(int[] numbers) {
// Создаем метод и объявляем массив
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 6, 7, 9, 2, 5, 12,};
        printSeparator();
        for (int i = 0; i < numbers.length; i++) {
            printNumbers(numbers[i]);
            if ((i + 1) % 2 == 0) {
                printSeparator();
            }
            if (numbers[i] >= 3 && numbers[i] <= 7) {
                numbers[i] = numbers[i];
            }
        }
        return;
    }
}



