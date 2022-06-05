import org.junit.jupiter.api.Test;

public class Calculator {

    /**
     * Дополнительно
     * */

    public static double sum(double x,double y){
        return x+y;
    }
    public static double subtraction(double x,double y){
        return x-y;
    }
    public static double multiplication(double x,double y){
        return x*y;
    }
    public static double division(double x,double y){
        return x/y;
    }


    /**
     * Методы со старого дом. задания
     * */

    public static boolean byThreeOrNotBy(int number) {

        return (getSumOfDigitsFromPositiveNumber(number) % 3 == 0);
    }


  private static int getSumOfDigitsFromPositiveNumber(int num) {
        num = Math.abs(num);
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }







}
