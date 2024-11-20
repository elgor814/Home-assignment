import java.util.Arrays;

public class Main {

    static void createArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {  // Проверим размер массива 4 на 4
            throw new MyArraySizeException("Неверный размер массива, количество строк не равно 4");
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива: в строке не 4 элемента");
            }
        }

        int[][] numbers = new int[4][4];//Создадим массив для хранения преобразованных целочисленных значений
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                try {
                    numbers[i][j] = Integer.parseInt(array[i][j]);
                    sum += numbers[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать значение " + array[i][j] + " в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println(" Преобразованный массив: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println("\n Сумма элементов преобразованного массива равна: " + sum);
    }

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "8", "5"},
                {"5", "6", "5", "8"}, //:)
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            createArray(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());  // Если исключение выброшено, выводим сообщение об ошибке
        }
    }
}