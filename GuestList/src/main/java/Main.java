/*
 * Author: Kyle Y.
 * Date  : 6/4/2026
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static void main(String[] args){
        System.out.println("How many people are in this guest list?");
        Scanner KEYBOARD = new Scanner(System.in);

        //Gets number of people to add
        int number_of_people = KEYBOARD.nextInt();
        if (number_of_people == 0) {
            System.out.println("There are no guests on the list.");
            return;
        }

        System.out.println("Please enter the names of the guests, one per line.");

        //Creates an array list to store guest names
        ArrayList<String> guests = new ArrayList<>();
        for (int names = 0; names <= number_of_people; ++names) {
            String guest_names = KEYBOARD.nextLine();
            guests.add(guest_names);
        }

        StringBuilder builder = new StringBuilder();
        builder.repeat("-", 56);

        //Prints out guest list
        System.out.print("Here is the guest list:\n" + builder);
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
