package Lesson7;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = getMax(a,b);
        System.out.println(result);

    }
    public static int getMax(int first, int second ) {
       if (first > second) {
           return first;
       } else {
          return second;
       }
    }
}
