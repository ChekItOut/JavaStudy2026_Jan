package a_Generic1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(100);
        System.out.println("integer: " + integerBox.get());

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("test");
        System.out.println("string: " + stringBox.get());
    }
}
