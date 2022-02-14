package Lesson7;

public class WhileEx {
    public static void main(String[] args) {
        int val = 0;
        do {
            System.out.println(val);
            val++;
        } while (val<10);

    }

    private static void whileEx() {
        int val = 10;
        while (val>0) {
            System.out.println(val);
            val--;
        }
    }
}
