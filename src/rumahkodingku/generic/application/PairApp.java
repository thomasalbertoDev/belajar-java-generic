package rumahkodingku.generic.application;

import rumahkodingku.generic.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 10);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

}
