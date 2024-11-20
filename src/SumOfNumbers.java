class Main {
    public static void main(String[] args) {
        // Вывод всех четных чисел от 1 до 100
        System.out.println("Четные числа:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nНечетные числа:");
        // Вывод всех нечетных чисел от 1 до 100
        for (int j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }
}