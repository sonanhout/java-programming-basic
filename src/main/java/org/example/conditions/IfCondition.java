package org.example.conditions;
    import java.util.Scanner;
public class IfCondition {
     static void main() {
        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("input an average: ");
        average = input.nextDouble();

        // IF Statment
         if(average < 25) {
             System.out.println("Average is less than 25");
             System.out.println("You are failed");
             System.out.println("Please try again next month");
         }
          if (average >= 25){
              System.out.println("Average is greater than 25");
              System.out.println("You are pass");
              System.out.println("Congratulation");
          }
    }
}
