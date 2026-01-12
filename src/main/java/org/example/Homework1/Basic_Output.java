package org.example.Homework1;
import java.util.Scanner;
public class Basic_Output {
    static void main() {
        Scanner sc = new Scanner(System .in);

        System.out.println("Please input your name");
        String student_name = sc.next();

        System.out.println("Please input your old");
        String student_olds = sc.next();

        System.out.println("Please input your address");
        String student_address = sc.next();

        System.out.println("student name = " + student_name );
        System.out.println("student olds = " + student_olds );
        System.out.println("student address = " + student_address );

    }
}
