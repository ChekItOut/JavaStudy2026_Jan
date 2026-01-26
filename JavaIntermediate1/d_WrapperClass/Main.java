package d_WrapperClass;

public class Main {
    public static void main(String[] args) {
        //Integer 래퍼클래스 만들기
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);

        //내부 값 읽기
        int value = newInteger.intValue();
        System.out.println("newInteger value: " + value);

        //비교하기
        System.out.println("비교하기");
        System.out.println("==: "+ (newInteger==integerObj));
        System.out.println("equals(): "+ (newInteger.equals(integerObj)));
    }
}
