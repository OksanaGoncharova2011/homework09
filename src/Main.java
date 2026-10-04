//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // ==========================================
    // ЗАДАЧА 1: Объявление трех массивов
    // ==========================================

    // 1. Целочисленный массив с помощью new
    int[] weight = new int[3];
    weight[0] = 1;
    weight[1] = 2;
    weight[2] = 3;

    // 2. Дробный массив (сразу заполненный)
    double[] jo = {1.57, 7.654, 9.986};

    // 3. Произвольный третий массив (например, числа)
    int[] jonn = {5, 6, 7, 9, 18, 12, 45, 74, 89};

    // ==========================================
    // ЗАДАЧА 2: Вывод по порядку через запятую
    // ==========================================
    System.out.println("Задача 2:");

    // Первый массив
    for (int index = 0; index < weight.length; index++) {
        System.out.print(weight[index]);
        if (index < weight.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();

    // Второй массив
    for (int index = 0; index < jo.length; index++) {
        System.out.print(jo[index]);
        if (index < jo.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println();

    // Третий массив
    for (int index = 0; index < jonn.length; index++) {
        System.out.print(jonn[index]);
        if (index < jonn.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("\n");

    // ==========================================
    // ЗАДАЧА 3: Вывод в ОБРАТНОМ порядке через запятую
    // ==========================================
    System.out.println("Задача 3:");

    // Первый массив в обратном порядке
    for (int index = weight.length - 1; index >= 0; index--) {
        System.out.print(weight[index]);
        if (index > 0) {
            System.out.print(", "); // запятая НЕ ставится в самом конце (когда index == 0)
        }
    }
    System.out.println();

    // Второй массив в обратном порядке
    for (int index = jo.length - 1; index >= 0; index--) {
        System.out.print(jo[index]);
        if (index > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();

    for (int index = jonn.length - 1; index >= 0; index--) {
        System.out.print(jonn[index]);
        if (index > 0) {
            System.out.print(", ");
        }
    }
    System.out.println("\n");

    // ==========================================
    // ЗАДАЧА 4: Преобразование нечетных чисел в четные
    // ==========================================
    System.out.println("Задача 4:");

    for (int index = 0; index < weight.length; index++) {
        if (weight[index] % 2 != 0) {
            weight[index] += 1;
        }
    }

    // Выводим результат Задачи 4 в квадратных скобках
    System.out.println(Arrays.toString(weight));
}




    


