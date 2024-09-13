
package rumahkodingku.generic.application;

import rumahkodingku.generic.MyData;

// Wildcard pada java merupakan konsep yang dimana jika kita ingin memprint data T, tidak peduli tipe data apapun itu 

public c

ass WildcardApp {

    public static void main(String[] args) {

        print(new MyData<String>("Hello"));
        print(new MyData<Integer>(10));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
