package Lesson9;

public class HomeWork9 {

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        someArraysActions(array);

    }

    public static void someArraysActions(String[][] array) {

        int sum = 0;

        if (array.length != 4) {
            throw new MyArraySizeException("Массив не подходит по параметру: 4х4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].length != 4) {
                    throw new MyArraySizeException("Массив не подходит по параметру: 4х4");
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException numEx) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма всего массива равна: " + sum);
    }
}