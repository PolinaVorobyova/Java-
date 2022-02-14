package Lesson5;

public class Lesson5Task3 {
    public static void main(String[] args) {
        int rub = 41;
        /**
         * рубль 1 !11
         * рублей 5 6 7 8 9 10-19
         * рубля 2 3 4
         */
        if (rub%10==1 && rub%100!=11) {
            System.out.println(rub + " рубль");
        } else if ((rub%10 == 0) || (rub%10>=5 && rub%10 <=9) || (rub%100>=11 && rub%100<=19)) {
            System.out.println(rub + " рублей");
        } else if (rub%10>=2 && rub%10<=4) {
            System.out.println(rub + " рубля");
        }
    }
}
