/**
* Java Basic. Home work #2
*
*@author Veronika
*@todo 07.09-2022
*@date 13-29.09-2022
*/


class DomZadanie2 {
     // home1 
     static String checkWeather (int temperature){     
             if(temperature <= -210) { 
             return "It's veryfrost"; 
         } else if (temperature <= 18) { 
             return "It's cold"; 
         } else if (temperature <= 28) { 
             return "It's warm"; 
         } else { 
             return "It's hot";          
         }   
         }
         // home2
         static Boolean canWalk(Boolean isWeekend, Boolean isWork) {          
         
         if(isWeekend && !isWork) {
             return true; 
         } else { 
             return false; 
         }    
     }
          // home3
      static int getAddition(int x, int y) { 
         int zet = x + y; 
         return zet; 
     } 
     static int getSubtraction(int x, int y) { 
         int key = x - y; 
         return key; 
     } 
     static int getMultiplication(int x, int y) { 
         int jey = x * y; 
         return jey; 
     } 
     static double getDivision(int x, int y) { 
         double si = (double) x / y; 
         return si; 
     }      
         public static void main(String[] args) {
         int x = 6; 
         int y = 3; 
         int temperature = 0;
         Boolean isWeekend = true;          
         Boolean isWork = false;               
         System.out.println(canWalk(isWeekend, isWork));      
         System.out.println(checkWeather(temperature));         
         System.out.println(getAddition(x, y)); 
         System.out.println(getSubtraction(x, y)); 
         System.out.println(getMultiplication(x, y)); 
         System.out.println(getDivision(x, y));     
    }
}






 


    
    
    
   

    