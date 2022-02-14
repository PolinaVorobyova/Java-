package Lesson5;

public class Leaaon5Task4 {
    public static void main(String[] args) {
        int value = 2024;
        isLeapYear(value);


    }
    public static boolean isLeapYear(int year) {
      return year%400==0 || (year%4 ==0 && year%100 !=0);

    }
}
