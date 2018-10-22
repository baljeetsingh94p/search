package search;

import java.util.Scanner;
import java.util.Random;

public class Search {

    public static void main(String[] args) {
        Random randObj = new Random();
        Scanner keyboard = new Scanner(System.in);
        int randomNumber, elemCount, searchNumber, i, j, location =0;

        System.out.print("how many elements? ");
        elemCount = keyboard.nextInt();
        int[] array1 = new int[elemCount];
        System.out.println("random numbers are");
        for (i = 0; i < elemCount; i++) {

            randomNumber = randObj.nextInt(999);
            array1[i] = randomNumber;

            System.out.println(i + 1 + ":" + randomNumber);

        }
        System.out.print("which number to search? ");

        searchNumber = keyboard.nextInt();
        for (i = 0; i < elemCount; i++) {
            if (searchNumber == array1[i]) {
                location = i+1;
            }
        }
        if (location == 0) {
            System.out.println("element not found ");
        } else {
            System.out.println("element found at index:" + location);
        }
        System.out.println("");
        System.out.println("end of this assignment");

    }

}


