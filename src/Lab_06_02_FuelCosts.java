import java.util.Scanner;

public class Lab_06_02_FuelCosts {

    public static void main(String[] args) {;
        System.out.println("Input number of gallons:");
        Scanner input1 = new Scanner(System.in);
        double gallons = input1.nextDouble();
        System.out.println("Input your MPG:");
        Scanner input2 = new Scanner(System.in);
        double mpg = input2.nextDouble();
        System.out.println("Input the gasoline price:");
        Scanner input3 = new Scanner(System.in);
        double gasPrice = input3.nextDouble();
        System.out.println("The gas price per 100 miles is: " + gasPrice * 100);
        System.out.println("The amount of miles left in the tank is: " + gallons * mpg);
    }
}