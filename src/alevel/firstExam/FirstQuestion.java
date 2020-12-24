//Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4.


package alevel.firstExam;

import java.util.Arrays;

public class FirstQuestion {

    public static void main(String[] args) {

        int[] array = {1, 4, 5, 1, 1, 3};

        System.out.println("Кол-во различных элементов в массиве: "
                + counterOfDifferentNumbers(sort(array)));

    }

    public static int[] sort(int[] array) {      //отсортируем изначальный массив для упрощения задачи

        for (int j = 0; j < (array.length - 2); j++) {
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    int sort = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = sort;
                }
            }
        }
        return array;
    }

    public static int counterOfDifferentNumbers(int[] array) {      // Подсчет различных элементов массива

        int counter = 1;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] != array[i + 1])
                counter++;
        }
        return counter;
    }


}
