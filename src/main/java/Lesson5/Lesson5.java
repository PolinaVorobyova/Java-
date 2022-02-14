package Lesson5;

public class Lesson5 {
    /**
     *
     * 1. Дан порядковый номер месяца, вывести сезон.
     */
    public static void main(String[] args) {
        int month = 9;
        /** зима - 12 1 2
         * весна - 3 4 5
         * лето 6 7 8
         * осень 9 10 11
         */
        if (month ==12 || month ==1 || month ==12) {
            System.out.println("Зима");
        } else if (month ==3 || month ==5 || month ==4) {
            System.out.println("Весна");}
        else if (month ==6 || month ==7 || month ==8) {
            System.out.println("Leto");}
        else if (month ==9 || month ==10 || month ==11) {
            System.out.println("Osen'");}


    }
}
