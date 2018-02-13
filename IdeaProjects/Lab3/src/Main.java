import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int carMPG = 0;

        System.out.print("Enter your car's MPG rating (miles/gallon) as a postive integer: ");
        carMPG = scnr.nextInt();

        if (carMPG <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        double carcapacity = 0;

        System.out.print("Enter your car’s tank capacity (gallons) as a positive decimal number: ");
        carcapacity = scnr.nextDouble();

        if (carcapacity <= 0) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;

        }

        double gaspercentage = 0;

        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        gaspercentage = scnr.nextDouble();

        if (gaspercentage < 0 || gaspercentage > 100) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;

        }
        double rawRange = 0;
        double Range = 0;
        rawRange = carMPG * carcapacity * (gaspercentage*0.01);
        Range = Math.floor(rawRange);
        int var = 0;
        var = (int) Range;

        if (var <= 25) {
            System.out.println("Attention! Your current estimated range is running low: " + var + " miles left!!!");
        }
        else {
            System.out.println("Keep driving! Your current estimated range is: " + var + " miles!");
        }

    }

}
