package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input id: ");
        String studentId = sc.next();

        System.out.print("Please input student first name : ");
        String studentFirstName = sc.next();

        System.out.print("Please input last name: ");
        String studentLastName = sc.next();


        System.out.print("Please input gender: ");
        String studentGender = sc.next();


        System.out.print("Please input date of birth: ");
        String dateOfBirth = sc.next();


        System.out.print("Please input place of birth: ");
        String placeOfBirth = sc.next();



        System.out.println("Student ID = " + studentId);
        System.out.println("Student first name = " + studentFirstName);
        System.out.println("Student last name = " + studentLastName);
        System.out.println("Student gender = " + studentGender);
        System.out.println("Student date of birth = " + dateOfBirth);
        System.out.println("Student place of birth = " + placeOfBirth);
        System.out.println("All Student Information");

    }
}
