package rashed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Name: Rashed Ahmod
         * ID: 2012020123
         * Section: C
         * Email: cse_2012020123@lus.ac.bd
         * Date: 15-07-2021
         */

        Scanner input = new Scanner(System.in);
        String section;
        System.out.print("Enter my section: ");
        section = input.nextLine();
        System.out.println("Section: "+section);

        Info myInfo = new Info();
        System.out.println("Name: "+myInfo.name);
        System.out.println("Id: "+myInfo.id);

        Hobby myHobby = new Hobby();
        System.out.println("Hobby: "+myHobby.hobbyName);
    }
}

