/**
* Java Basic. Home work #4
*
*@author Veronika
*@tod 14.09-2022
*@date 15.09-17.09.2022
*
*/


	import java.util.Scanner;
    import java.util.Random;
    import java.io.IOException;

class DomZadanie4 {
    public static void main(String[] args) {
        // home1-2
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int guess = -1;
        int number = random.nextInt(10);
        while(count < 3 && guess != number) {
            System.out.print("Guess the number (0..9): ");
            guess = sc.nextInt();
            if (number != guess) {
                System.out.println("Your number is " +
                    ((guess > number)? "less" : "more"));
                count++;
            }
        }
        System.out.println("You " +
            ((guess == number)? "Winner!" : "Lose: " + number));
            
           
        do { int[] arr = {1};
            for (int a : arr) 

            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (sc.nextInt() == 1);
    }
 }
        
    
    
