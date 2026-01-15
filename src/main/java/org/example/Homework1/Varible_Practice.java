package org.example.Homework1;
import java.util.Scanner;
public class Varible_Practice {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("please input name: ");
      String studentName = sc.next();       System.out.print("please input Age: ");
       Integer studentAge = sc.nextInt();

       System.out.print("please input height: ");
       Boolean studentHeight = sc.hasNext();

        System.out.print("please input place is student: ");
       Boolean placeIsStudent= sc.hasNextBoolean();

        System.out.println("Student name = " + studentName);
        System.out.println("Student Age = " + studentAge);
        System.out.println("Student height = " + studentHeight);
        System.out.println("Student place is student = " + placeIsStudent);


        
    }
}
