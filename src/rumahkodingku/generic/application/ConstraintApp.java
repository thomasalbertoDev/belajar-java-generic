package rumahkodingku.generic.application;

public class ConstraintApp {

    public static void main(String[] args) {
        // Bounded type parameter pada java merupakan type parameter yang hanya boleh menggunakan type parameter yang ditentukan oleh constraint tersebut dalam class khusus 
        NumberData<Integer> integerNumberData = new NumberData<>(10);

        System.out.println(integerNumberData.getData());

    }

    public static class NumberData<T extends Number> {

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
}
