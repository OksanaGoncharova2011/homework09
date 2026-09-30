//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //_TASK1________________________
    int[] weight = new int[12];
    weight[0] = 1;
    weight[1] = 2;
    weight[2] = 3;
    System.out.println(weight[0]);
    double[] jo = {1.57, 7.654, 9.986};
    System.out.println(jo[0]);
    int[] jonn = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
    System.out.println(jonn[0]);
    for (int index = jonn.length - 1; index >= 0; index--) {
        System.out.print(jonn[index] + " 1");
    }

    for (int index = weight.length - 1; index >= 0; index--) {
        System.out.print(weight[index] + " " + "2");
    }

    for (int index = jo.length - 1; index >= 0; index--) {
        System.out.print(jo[index] + " " + "3");
    }

    int[] arr = {1, 2, 3};

    // Циклом for проходим по каждому элементу массива от 0 до конца
    for (int index = 0; index < arr.length; index++) {

        // Проверяем текущее число на нечетность.
        // Если число при делении на 2 дает остаток, не равный 0, значит оно нечетное.
        if (arr[index] % 2 != 0) {
            arr[index] += 1; // Прибавляем 1, делая число четным (это то же самое, что arr[index] = arr[index] + 1)
        }
    }

    // Распечатываем итоговый массив в квадратных скобках через запятую
    System.out.println(Arrays.toString(arr));



    }
    


