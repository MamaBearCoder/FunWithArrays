import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //set up array
        ArrayList<String> colors = new ArrayList<String>();

        //add colors
        colors.add("blue");
        colors.add("aqua");
        colors.add("white");

        //print out list
        System.out.println(colors);

        //print out the color at index 1
        System.out.println(colors.get(1));

        //Import Scanner class to have user input new color and add it to arraylist
        Scanner keyboard = new Scanner(System.in);

        //User input
        System.out.println("Enter new color:");
        String color2 = keyboard.next();

        // while loop to allow user to keep entering colors, or press q
        while (!color2.equals("q")) {
            colors.add(color2);
            System.out.println(colors);

            System.out.println("Enter new color");
            color2 = keyboard.next();

        }
        System.out.println(colors);
    }

    }

