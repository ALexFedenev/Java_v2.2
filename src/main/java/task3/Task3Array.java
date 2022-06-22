package task3;

import java.util.Arrays;

public class Task3Array {
    public static void main(String[] args) {
        int[] array = new int[20]; //объявили массив, определили количество элементов
        for (int i = 0; i < array.length; i++) {  //заполнили массив случайными целыми числами
            array[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println("Созданный массив:\n" + Arrays.toString(array));
        int maxNeg = 0;
        int minPos = 0;
        int i;
        int index = 0;
        int c = 0;
        int s = 0;
        int index2 = 0;
        for (i = 0; i < array.length; i++) { // ищем любое первое отрицательное значение массива, записываем в переменную, сохраняем индекс, выходим из цикла
            if (array[i] < 0) {
                maxNeg = array[i];
                c = i;
                break;
            }
        }
        int maxNegProm = maxNeg;
        for (i = 0; i < array.length; i++) {   //перебираем массив ищем максимальное отрицательное значение и присваиваем индекс
            if (array[i] < 0 && array[i] > maxNegProm) {
                maxNegProm = array[i];
                index = i;
            }
        }
        if (maxNeg == maxNegProm) {  //если на первом цикле поиска отрицательного числа сразу нашлось его максимальное значение то присваиваем этот индекс
            index = c;
        }
        for (i = 0; i < array.length; i++) {  // ищем любое первое положительное значение массива, записываем в переменную, сохраняем индекс
            if (array[i] > 0) {
                minPos = array[i];
                s = i;
                break;
            }
        }
        int minPosProm = minPos;
        for (i = 0; i < array.length; i++) {  //перебираем массив ищем минимальное положительное значение и присваиваем индекс
            if (array[i] > 0 && array[i] < minPosProm) {
                minPosProm = array[i];
                index2 = i;
            }
        }
        if (minPos == minPosProm) {  //если на первом цикле поиска положительного числа сразу нашлось его минимальное значение то присваиваем этот индекс
            index2 = s;
        }
        int asd = array[index];   // введена переменная для подмены элементов массива
        array[index] = array[index2];
        array[index2] = asd;

        System.out.println("Измененный массив:\n" + Arrays.toString(array));
        System.out.println("Максимальный отрицательный элемент созданного массива: " + maxNegProm);
        System.out.println("Минимальный положительный элемент созданного массива: " + minPosProm);
    }
}


