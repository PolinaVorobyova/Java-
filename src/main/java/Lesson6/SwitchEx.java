package Lesson6;

public class SwitchEx {
    public static void main(String[] args) {
        int val = 2;
        switch (val) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("Two");
            case 20 -> System.out.println("Three");
            default -> System.out.println("no");
        }
        char alala = switch (val) {
            case 1 -> 3;
            case 2 -> 13;
            case 3 -> 23;
            default -> 100;
        };
        System.out.println(alala);
    }
}
