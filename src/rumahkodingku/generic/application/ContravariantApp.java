package rumahkodingku.generic.application;

import rumahkodingku.generic.MyData;

public class ContravariantApp {

    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Thomas");
        process(objectMyData);

    }

    public static void process(MyData<? super String> myData) {

        Object data = myData.getData();
        System.out.println(data);
    }

}
