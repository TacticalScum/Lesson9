package Lesson9;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int i, int j) {

        super(String.format("Невозможно преобразовать в int ячейку: %d - %d", i, j));
    }
}
