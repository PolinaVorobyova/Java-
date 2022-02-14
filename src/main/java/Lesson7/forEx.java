package Lesson7;

public class forEx {
    public static void main(String[] args) {
        for (int val = 10; val > 0; val--) {
            System.out.println(val);
            if (val == 5) {
                break;
            }
        }
    }

    private static void forEx1() {
        for (int val = 10; val > 0; val--) {
            System.out.println(val);
        }
    }
}

