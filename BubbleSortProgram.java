/* 
DATA STRUCTURE FINAL REQUIREMENT - GROUP 3
AKEEM DELA TORRE -- JOHN PAUL DE GUZMAN
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BubbleSortProgram {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        //prompt the user to enter the comma separted list elements 
        System.out.println("Enter a comma-separated list of alphabetic and special characters:");
        String input = inp.nextLine();
        
        //if statement 
        if (!isValidInput(input)) {
            //if invalid input format, we print this
            System.out.println("Invalid input format. Please enter a valid input.");
            main(args); //use a recursion to repeat the prompt
            
        }

        //abstract data types arraylist
        ArrayList<Character> list = new ArrayList<>();
        //for each loop to add each of the element.        
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        //method used to removed even numbers using modulus 2
        list.removeIf(c -> ((int) c) % 2 == 0); 

        //BUBBLE SORTING ALGO.
        Collections.sort(list, (a, b) -> ((int) a) - ((int) b)); 

        //if-else statement that print the characters based on the ASCII values without the event ASCII characters

        if(input.contains(",")){
        System.out.println("Sorted characters based on ASCII values after removing even ASCII characters:");
        for (char c : list) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        //else print the invalid input if the users prompt has no comma
    }   else{

        System.out.println("Invalid input. Missing comma.");
    }

        //repeatedly ask the user to run the program again
        System.out.println("Do you want to run again? Type (yes/no):");
        String choice = inp.nextLine().toLowerCase();


        if (choice.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Exiting program.");
        }
    }

    //boolean constructor that check users input if it has comma (,).
    private static boolean isValidInput(String input) {
        String[] inputs = input.split(",");

        //for each loop with if statement that checks each element if it has empty element it will return false
        
        for (String s : inputs) {
            if (s.isEmpty() || !s.matches("[a-zA-Z!@#$%^&*()_+{}|:<>?]+")) {
                return false;
            }
        }
        //otherwise it will print true
        return true;
    }
}

