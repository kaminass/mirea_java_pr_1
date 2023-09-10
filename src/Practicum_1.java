import java.util.Scanner;
public class Practicum_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // task 3

        System.out.println("task 3:");
        int[] mas3 = {1, 3, 5, 7, 10};
        System.out.println("Сумма элементов массива: " + sum_of_mas_for(mas3));
        System.out.println("Среднее арифметическое элементов массива: " + mean_of_mas(mas3));

        // task 4

        System.out.println("task 4:");
        System.out.println("Введите 10 элементов массива:");
        int [] mas4 = new int[10];
        for (int i = 0; i < 10; i++){
            mas4[i] = input.nextInt();
        }
        System.out.println("Сумма элементов массива: " + sum_of_mas_while(mas4));
        System.out.println("Минимальный элемент массива: " + min_of_mas(mas4));
        System.out.println("Максимальный элемент массива: " + max_of_mas(mas4));

        // task 5

        System.out.println("Введите 10 элементов массива:");
        int [] mas5 = new int[10];
        for (int i = 0; i < 10; i++){
            mas5[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println(mas5[i]);
        }

        // task 6

        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            float num = 1.0f / i;
            System.out.printf("Число номер %d = %.5f%n", i, num);
        }

        // task 7
        System.out.println("От какого числа посчитать факториал?");
        int number = input.nextInt();
        fact_of_number(number);
    }
    public static float mean_of_mas(int[] mas){
        return (float) sum_of_mas_for(mas) / mas.length;
    }
    public static int sum_of_mas_for(int[] mas){
        int sum = 0;
        for (int num : mas) {
            sum += num;
        }
        return sum;
    }
    public static int sum_of_mas_while(int[] mas){
        int sum = 0;
        int flag = 0;
        while (flag < mas.length){
            sum += mas[flag];
            flag++;
        }
        return sum;
    }
    public static int min_of_mas(int[] mas) {
        int min = mas[0];
        for (int num : mas) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int max_of_mas(int[] mas) {
        int max = mas[0];
        for (int num : mas) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static long fact_of_number(int n) {
        long factorial = 1;
        if (n < 0) {
            System.out.println("Факториал определен только для неотрицательных чисел.");
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
        return 0;
    }
}

