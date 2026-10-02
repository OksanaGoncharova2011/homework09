//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // ==========================================
    // ЗАДАНИЕ 1
    // ==========================================
    System.out.println("--- Задача 1 ---");

    // 1. Целочисленный массив с помощью new (по условию заполняем 1, 2, 3)
    int[] weight = new int[3];
    weight[0] = 1;
    weight[1] = 2;
    weight[2] = 3;

    // 2. Дробный массив сразу со значениями
    double[] jo = {1.57, 7.654, 9.986};

    // 3. Произвольный массив
    int[] jonn = {5, 6, 7, 9, 18, 12, 45, 74, 89};

    // ==========================================
    // ЗАДАНИЕ 2 (Вывод по порядку через запятую)
    // ==========================================
    System.out.println("--- Задача 2 ---");

    // Первый массив
    for (int index = 0; index < weight.length; index++) {
        System.out.print(weight[index]);
        if (index < weight.length - 1) {
            System.out.print(", "); // ставим запятую, только если элемент не последний
        }
    }
    System.out.println(); // Перенос строки

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
    System.out.println("\n"); // Два переноса строки

    // ==========================================
    // ЗАДАНИЕ 3 (Вывод в обратном порядке)
    // ==========================================
    System.out.println("--- Задача 3 ---");

    // Используем НАСТОЯЩИЙ массив weight, а не пустой weight02
    for (int index = weight.length - 1; index >= 0; index--) {
        System.out.print(weight[index]);
        if (index > 0) {
            System.out.print(", "); // не ставим запятую перед самым первым элементом (index == 0)
        }
    }
    System.out.println();

    // Используем НАСТОЯЩИЙ массив jo, а не пустой jo02
    for (int index = jo.length - 1; index >= 0; index--) {
        System.out.print(jo[index]);
        if (index > 0) {
            System.out.print(", ");
        }
    }
    System.out.println();

    // Используем НАСТОЯЩИЙ массив jonn, а не пустой jonn02
    for (int index = jonn.length - 1; index >= 0; index--) {
        System.out.print(jonn[index]);
        if (index > 0) {
            System.out.print(", ");
        }
    }
    System.out.println("\n");

    // ==========================================
    // ЗАДАНЫЕ 4 (Преобразование нечетных чисел)
    // ==========================================
    System.out.println("--- Задача 4 ---");

    // По условию работаем с ПЕРВЫМ массивом (это наш weight, где лежат 1, 2, 3)
    for (int index = 0; index < weight.length; index++) {
        if (weight[index] % 2 != 0) {
            weight[index] += 1;
        }
    }

    // Распечатываем итоговый измененный массив weight
    System.out.println(Arrays.toString(weight));

    }
    


