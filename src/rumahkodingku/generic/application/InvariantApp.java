package rumahkodingku.generic.application;

import rumahkodingku.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Thomas");
        // MyData<Object> objectMyData = stringMyData; // Error karena Object bukan turunan dari String

        MyData<Integer> integerMyData = new MyData<Integer>(10);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());

    }

}
