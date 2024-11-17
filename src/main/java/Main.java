import java.util.Arrays;

public class Main {

    static void createArray(String[][] array) throws MyArraySizeExceptions, MyArrayDataExceptions {

        if (array.length != 4) {  // Проверим размер массива 4 на 4
            throw new MyArraySizeExceptions("Неверный размер массива, количество строк не равно 4");
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeExceptions("Неверный размер массива: в строке не 4 элемента");
            }
        }

        int[][] numbers = new int[4][4]; //Создадим массив для хранения преобразованных целочисленных значений

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                try {
                    numbers[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExceptions("Невозможно преобразовать значение " + array[i][j] + " в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        System.out.println(" Преобразованный массив: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "8", "5"},
                {"5", "6", " :) ", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            createArray(array);
        } catch (MyArraySizeExceptions | MyArrayDataExceptions e) {
            e.printStackTrace();
            System.out.println(e.getMessage());  // Если исключение выброшено, выводим сообщение об ошибке
        }
    }
}