package es3;

public class Test {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 0; i < 1000; i++) {
            System.out.println(s);
            s = s + "0";
        }
    }
}
