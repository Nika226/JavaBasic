/**
* Java Basic. Home work #2
*
*@author Veronika
*@todo 07.09-2022
*@date 13-25.09-2022
*/

class DomZadanie2 {
    public static void main(String[] args) {      
    // home1
    int t = -210;
    boolean booleanExpression = t < 0;
    System.out.println(booleanExpression);
    if (booleanExpression) {
        System.out.println("is frost");
    } else {
        System.out.println("is no frost");    
        }
        
    t = 11;
    boolean booleanExpression2 = t > 0 || t == 18;
    System.out.println(booleanExpression2);
    if (booleanExpression) {
        System.out.println("is cold");
    } else {
        System.out.println("is no cold");    
        }
        
    t = 20;
    boolean booleanExpression3 = t > 0 || t == 28;
    System.out.println(booleanExpression3);
    if (booleanExpression) {
        System.out.println("is warm");
    } else {
        System.out.println("is no warm");    
                
    t = 30;
    boolean booleanExpression4 = t > 29;
    System.out.println(booleanExpression4);
    if (booleanExpression) {
        System.out.println("is hot");
    } else {
        System.out.println("is no hot"); 
    }  
    
      // home2

    boolean isWeekend = true;
    boolean isAmFree = true;
    boolean isRain = false;
    boolean isWork = false;
    
    if (isWeekend && isAmFree) {
         System.out.println("I can walk");            
        } else {
        System.out.println("I cannot walk");
        }
        
    if (isWork && isRain) {
         System.out.println("I cannot walk");            
        } else {
        System.out.println("I can walk");
   }
   // home3
    public class Main { /** U menay uje net nikakih sil ponyat pochemu na home3 rugaetsay kompillaytor.
    Ay stolko primerov peresmotrela v google. Ostanovilas na etom variante. I vse ravno oshibka(
    */
        
    static int myMethod(int a, int c) {
        return a + c;
     }       
    static int myMethod2(int a, int c) {
        return a - c;
     }        
    static int myMethod3(int a, int c) {
        return a * c;
     }    
    static float myMethod4(int af, int cf) {
        return af / cf;
     }    
   }
}

  
  
 





 


    
    
    
   

    