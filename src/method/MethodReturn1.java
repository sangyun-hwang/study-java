package method;

public class MethodReturn1 {

    static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        return i % 2 == 1;
    }
}
