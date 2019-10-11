import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        System.out.println("Welcome to your GPA calculator! What is your name?" );
        String name = in.nextLine();


        //Definition of the array
        ArrayList<Double> grade = new ArrayList<>();
        double x = 0.0;

        while ( x <= 4.0 && x >= 0.0 ){
            System.out.print("Enter a grade (-1 to stop): " );
            x = in.nextDouble();
            //Store the user input
            grade.add(x);

        }



        while ( x != -1) {
            //System.out.print("Enter -1 to stop" );
            x = in.nextInt();

        }
        grade.remove(7);


        double sum = 0.0;

        for (int a = 0; a < grade.size(); a++){

           //grade.get(a);

            sum=sum+grade.get(a);
            //sum = sum + a;

        }
        //System.out.println(sum); //This is to test the sum.


        double average;
        average = sum / 7;


        System.out.print("Hello, " + name + "! " + "Your GPA is below: " +
                "\nGPA: " );

        System.out.printf("%3.2f", average);


    }
}
