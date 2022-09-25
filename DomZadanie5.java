/**
* Java Basic. Home work #5
*
*@author Veronika
*@todo 19.09-2022
*@date 24.09-2022
*
*/
    import java.util.Random; 
    import java.util.Scanner; 
    
 public class DomZadanie5 {
    public static void main(String[] args) {
       
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);        
    
        String[] words = {"door", "rose", "beer", "road", "wind"};
        String word = words[random.nextInt(words.length)]; 
        char[] mask = {'#', '#', '#', '#'};   
        int counter = 0;    
    
        do {
          counter++;
          System.out.print("Guess the word: [" + new String(mask) + "]: ");
          char letter = scanner.next().charAt(0);
          for (int i = 0; i < word.length(); i++) {
               if (letter == word.charAt(i) && mask[i] == '#') {
                   mask[i] = letter;
         }
       }
              } while (counter < 5);       
               System.out.println("You guess the word [" + word + "], attempts: " + counter); 
     } 
 }
    