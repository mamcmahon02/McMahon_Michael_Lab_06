import java.util.Scanner;

public class Lab_06_01_CtoFConverter {

    public static void main(String[] args) {
        double fahrenheit;
        System.out.println("Input temperature in Celsius:");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is:" + fahrenheit);
    }
}
