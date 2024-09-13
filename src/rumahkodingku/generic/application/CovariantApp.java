package rumahkodingku.generic.application;

import rumahkodingku.generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Thomas");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        process(stringMyData);
        process(integerMyData);
    }

    public static void process(MyData<? extends Object> myData) {

        Object data = myData.getData();
        System.out.println(data);
    }
}
