package rumahkodingku.generic.application;

import rumahkodingku.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] name = {"Thomas", "Alberto"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(name));
        System.out.println(ArrayHelper.<Integer>count(numbers));
    }
}
