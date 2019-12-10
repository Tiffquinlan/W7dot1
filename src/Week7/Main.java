package Week7;

import java.util.Scanner;

public class Main {

    public static double average (double[] value){
        double total=0;
        for( int j = 0; j < value.length; j++ ) {
            total += value[j];
            //8System.out.println(average);
        }
        return total/value.length;
    }


    public static void main(String[] args) {
	// write your code here

            Scanner input = new Scanner(System.in);

            double[] value=new double[5];
            System.out.println("This program calculates the average of five numbers. ");
            // System.out.print("Please enter a number: ");
            // double number = input.nextDouble();
            for( int i = 0; i < value.length; i++ )
            {
                System.out.print("Please enter a number: ");
                value[i] = input.nextDouble();
            }


        System.out.print("The average of these five numbers is " + average(value));

    }
}
