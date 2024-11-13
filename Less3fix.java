public class Less3fix {

    // Задание 1

    static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
    }


    // Задание 2

    static void checkSumSign(int a, int b) {
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }


    // Задание 3

    static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else System.out.println("Желтый");
    }


    // Задание 4

    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }


    //Задание 5
    static boolean between10And20(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }


    // Задание 6

    static void PozitivNegativNumber(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }


    // Задание 7

    static boolean PozitivOrNegativ(int a) {
        return (a < 0);
    }


    // Задание 8

    static void printLine(String s, int a) {
        System.out.println(s.repeat(a));
    }

    static void printLine1(String s, int a) {
        for (int i = 1; i <= a; i++)
            System.out.print(s);
    }


    // Задание 9

    static boolean leapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }


    // Задание 10
    static void Array0Or1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }


    // Задание 11

    static void Array100(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }


    // Задание 12

    static void myArray(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");
        }
    }


    // Задание 13

    static void diagonalsOfArray(int[][] diagonalsArray) {
        for (int i = 0; i < diagonalsArray.length; i++) {

            for (int j = 0; j < diagonalsArray.length; j++) {

                if (i == j || i + j == diagonalsArray.length - 1) {
                    diagonalsArray[i][j] = 1;
                }
                System.out.print(diagonalsArray[i][j]);
            }
            System.out.println();
        }
    }


    //Задание 14

    static void methodArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {


        //1
        System.out.println("Задание 1");
        printThreeWords();


        //2
        System.out.println("\n Задание 2");
        checkSumSign(3, 5);
        System.out.println();

        //3
        System.out.println("\n Задание 3");
        printColor(150);
        System.out.println();

        //4
        System.out.println("\n Задание 4");
        compareNumbers(45, 7);

        //5
        System.out.println("\n Задание 5");
        between10And20(106, 10);


        //6
        System.out.println("\n Задание 6");
        PozitivNegativNumber(-3);

        //7
        System.out.println("\n Задание 7");
        PozitivOrNegativ(-15);


        //8
        System.out.println("\n Задание 8");
        printLine("Lena", 5);
        printLine1("Var", 3);


        //9
        System.out.println("\n\n Задание 9");
        System.out.println(leapYear(2024));
        System.out.println(leapYear(2027));

        //10
        System.out.println("\n\n Задание 10");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Array0Or1(arr);


        //11
        System.out.println("\n\n Задание 11");
        int[] array = new int[100];
        Array100(array);


        //12
        System.out.println("\n\n Задание 12");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        myArray(arr2);


        //13
        System.out.println("\n\n Задание 13");
        int[][] array1 = new int[5][5];
        diagonalsOfArray(array1);


        //14
        System.out.println("\n\n Задание 14");
        methodArr(7, 5);

    }
}
